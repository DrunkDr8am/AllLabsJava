package ru.mephi.head1.BigDesimal;

import java.math.BigInteger;
import java.util.Objects;


public class MyBigDecimal {

    private final BigInteger intVal;

    private final int scale;

    final int precision;

    MyBigDecimal(BigInteger intVal, int scale, int prec) {
        this.scale = scale;
        this.precision = prec;
        this.intVal = intVal;
    }

    public static MyBigDecimal valueOf(double val) { //from double
        return new MyBigDecimal(Double.toString(val), 0, Double.toString(val).length());
    }

    public MyBigDecimal(String val, int offset, int len) {
        char[] in = val.toCharArray();
        try {
            Objects.checkFromIndexSize(offset, len, in.length);
        } catch (IndexOutOfBoundsException e) {
            throw new NumberFormatException
                    ("Bad offset or len arguments for char[] input.");
        }

        int prec = 0;
        int scl = 0;
        BigInteger rb;

        try {

            boolean isneg = false;
            if (in[offset] == '-') {
                isneg = true;
                offset++;
                len--;
            } else if (in[offset] == '+') {
                offset++;
                len--;
            }


            boolean dot = false;
            long exp = 0;
            char c;
            int idx = 0;

            char coeff[] = new char[len];
            for (; len > 0; offset++, len--) {
                c = in[offset];
                if ((c >= '0' && c <= '9') || Character.isDigit(c)) {
                    if (c == '0' || Character.digit(c, 10) == 0) {
                        if (prec == 0) {
                            coeff[idx] = c;
                            prec = 1;
                        } else if (idx != 0) {
                            coeff[idx++] = c;
                            ++prec;
                        }
                    } else {
                        if (prec != 1 || idx != 0)
                            ++prec;
                        coeff[idx++] = c;
                    }
                    if (dot)
                        ++scl;
                    continue;
                }

                if (c == '.') {

                    if (dot)
                        throw new NumberFormatException("Character array"
                                + " contains more than one decimal point.");
                    dot = true;
                    continue;
                }
                if ((c != 'e') && (c != 'E'))
                    throw new NumberFormatException("Character array"
                            + " is missing \"e\" notation exponential mark.");
                exp = parseExp(in, offset, len);
                if ((int) exp != exp)
                    throw new NumberFormatException("Exponent overflow.");
                break;
            }
            if (prec == 0)
                throw new NumberFormatException("No digits found.");
            if (exp != 0) {
                scl = adjustScale(scl, exp);
            }

            StringBuilder sb = new StringBuilder(isneg ? "-" : "");
            rb = new BigInteger(sb.append(coeff, 0, prec).toString());

        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
            NumberFormatException nfe = new NumberFormatException();
            nfe.initCause(e);
            throw nfe;
        }
        this.scale = scl;
        this.precision = prec;
        this.intVal = rb;
    }

    private int adjustScale(int scl, long exp) {
        long adjustedScale = scl - exp;
        if (adjustedScale > Integer.MAX_VALUE || adjustedScale < Integer.MIN_VALUE)
            throw new NumberFormatException("Scale out of range.");
        scl = (int) adjustedScale;
        return scl;
    }

    private static long parseExp(char[] in, int offset, int len) { // парсим экспоненту
        long exp = 0;
        offset++;
        char c = in[offset];
        len--;
        boolean negexp = (c == '-');

        if (negexp || c == '+') {
            offset++;
            c = in[offset];
            len--;
        }
        if (len <= 0)
            throw new NumberFormatException("No exponent digits.");

        while (len > 10 && (c == '0' || (Character.digit(c, 10) == 0))) {
            offset++;
            c = in[offset];
            len--;
        }
        if (len > 10)
            throw new NumberFormatException("Too many nonzero exponent digits.");

        for (; ; len--) {
            int v;
            if (c >= '0' && c <= '9') {
                v = c - '0';
            } else {
                v = Character.digit(c, 10);
                if (v < 0)
                    throw new NumberFormatException("Not a digit.");
            }
            exp = exp * 10 + v;
            if (len == 1)
                break;
            offset++;
            c = in[offset];
        }
        if (negexp)
            exp = -exp;
        return exp;
    }

    private static BigInteger bigMultiplyPowerTen(BigInteger value, int n) {
        if (n <= 0)
            return value;
        return value.multiply(bigTenToThe(n));
    }

    private static BigInteger bigTenToThe(int n) {
        if (n < 0)
            return BigInteger.ZERO;
        return BigInteger.TEN.pow(n);
    }

    public MyBigDecimal add(MyBigDecimal other) {
        return add(this.intVal, this.scale, other.intVal, other.scale);
    }

    private static MyBigDecimal add(BigInteger first, int scale1, BigInteger second, int scale2) {
        int rscale = scale1;
        long sdiff = (long) rscale - scale2;
        if (sdiff != 0) {
            if (sdiff < 0) {
                int raise = checkScale(first, -sdiff);
                rscale = scale2;
                first = bigMultiplyPowerTen(first, raise);
            } else {
                int raise = checkScale(second, sdiff);
                second = bigMultiplyPowerTen(second, raise);
            }
        }
        BigInteger sum = first.add(second);
        return new MyBigDecimal(sum, rscale, 0);
    }

    private static int checkScale(BigInteger intVal, long val) {
        int asInt = (int) val;
        return asInt;
    }

    private transient String stringCache;

    public String toString() {
        String sc = layoutChars();
        return sc;
    }

    public MyBigDecimal multiply(MyBigDecimal multiplicand) {
        int productScale = checkScale(null, (long) scale + multiplicand.scale);
        return multiply(this.intVal, multiplicand.intVal, productScale);
    }

    private static MyBigDecimal multiply(BigInteger x, BigInteger y, int scale) {
        return new MyBigDecimal(x.multiply(y), scale, 0);
    }

    private String layoutChars() {
        StringBuilder buf = new StringBuilder();
        BigInteger copyBigInteger = intVal;
        if (intVal.signum() == -1) {
            buf.append('-');
            copyBigInteger = copyBigInteger.negate();
        }
        int size = copyBigInteger.toString().length();
        long adjusted = -(long)scale + (size -1);
        for (int i = 0; i < size; i++) {
            if (i == (size-adjusted) - scale && i != 0) {
                buf.append('.');
            }
            BigInteger powTen = BigInteger.valueOf(10).pow(size - i - 1);
            buf.append(copyBigInteger.divide(powTen));
            copyBigInteger = copyBigInteger.mod(powTen);
        }
        if (adjusted != 0) {             // [!sci could have made 0]
            buf.append('E');
            if (adjusted > 0)            // force sign for positive
                buf.append('+');
            buf.append(adjusted);
        }
        return buf.toString();
    }

    public double toDouble() {
        return Double.parseDouble(this.toString());
    }
}