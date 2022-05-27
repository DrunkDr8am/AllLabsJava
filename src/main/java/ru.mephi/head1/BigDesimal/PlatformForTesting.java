package ru.mephi.head1.BigDesimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class PlatformForTesting {
    public static void main(String[] args) {

        double a0 = 1;
        double a1 = 0;
        double a2 = Double.MAX_VALUE;
        double a3 = Double.MIN_VALUE;
        double a4 = -67.8562;
        double a5 = -a4;
        double a6 =11.12;

        BigDecimal b0 = BigDecimal.valueOf(1000);
        MyBigDecimal mb0 = MyBigDecimal.valueOf(1000);
        BigDecimal b1 = BigDecimal.valueOf(0.001);
        MyBigDecimal mb1 = MyBigDecimal.valueOf(0.001);
        BigDecimal b2 = BigDecimal.valueOf(a2);
        BigDecimal b3 = BigDecimal.valueOf(a3);
        MyBigDecimal mb2 = MyBigDecimal.valueOf(a2);
        MyBigDecimal mb3 = MyBigDecimal.valueOf(a3);
        BigDecimal b4 = BigDecimal.valueOf(a4);
        BigDecimal b5 = BigDecimal.valueOf(a5);
        MyBigDecimal mb4 = MyBigDecimal.valueOf(a4);
        MyBigDecimal mb5 = MyBigDecimal.valueOf(a5);

        MyBigDecimal mb8 = MyBigDecimal.valueOf(11.12);
        System.out.println(mb8.toString());

        BigDecimal b6 = BigDecimal.valueOf(a5);
        b6=b4.plus(new MathContext(3));

        b1 = b1.multiply(b1);
        b2 = b2.multiply(b2);
        b3 = b3.multiply(b3);
        b4 = b4.multiply(b4);
        b5 = b5.multiply(b5);
        BigDecimal b7 = b6.multiply(b6);
        b5 = b5.multiply(BigDecimal.valueOf(1));

        mb1 = mb1.multiply(mb1);
        mb2 = mb2.multiply(mb2);
        mb3 = mb3.multiply(mb3);
        mb4 = mb4.multiply(mb4);
        mb5 = mb5.multiply(mb5);
        mb5 = mb5.multiply(MyBigDecimal.valueOf(1));

//        b1 = b1.add(b1);
//        b2 = b2.add(b2);
//        b3 = b3.add(b3);
//        b4 = b4.add(b4);
//        b5 = b5.add(b5);
//        b5 = b5.add(BigDecimal.valueOf(1));
//
//        mb1 = mb1.add(mb1);
//        mb2 = mb2.add(mb2);
//        mb3 = mb3.add(mb3);
//        mb4 = mb4.add(mb4);
//        mb5 = mb5.add(mb5);
//        mb5 = mb5.add(MyBigDecimal.valueOf(1));

        System.out.println(b1.doubleValue());
        System.out.println(b2.doubleValue());
        System.out.println(b3.doubleValue());
        System.out.println(b4.doubleValue());
        System.out.println(b5.doubleValue());
        System.out.println();

        System.out.println(mb1.toDouble());
        System.out.println(mb2.toDouble());
        System.out.println(mb3.toDouble());
        System.out.println(mb4.toDouble());
        System.out.println(mb5.toDouble());

    }
}
