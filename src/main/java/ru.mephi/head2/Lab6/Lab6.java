package ru.mephi.head2.Lab6;

public class Lab6 {
    /**
     *  Повторите предыдущее упражнение, но на этот раз сделайте методы t r a n s
     * la t e () и s c a le () модифицирующими.
     */
    public static void main(String[] args) {
        PointMutate p = new PointMutate(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.printf("[x=%s;y=%s]", p.getX(), p.getY());
    }


    /*
     * Класс точки для двумерной координатной оси
     *
     * @author Zeluakov Andrei
     * @version 1.1
     */
    private static class PointMutate {
        private double x;
        private double y;

        /*
         * Конструктор без параметров.
         * Создает {@link Point} в координате (0;0)
         */
        public PointMutate() {
            this(0,0);
        }

        /*
         * Конструктор по определенным координатам
         *
         * @param x координата по оси Х
         * @param y координата по оси Y
         */
        public PointMutate(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /*
         * Получить координату {@link Point} по оси Х
         *
         * @return координата по оси Х
         */
        public double getX() {
            return x;
        }

        /*
         * Получить координату {@link Point} по оси Y
         *
         * @return координата по оси Y
         */
        public double getY() {
            return y;
        }

        /*
         * Перемещение {@link Point} на определенное расстояние в направлении координат x и y
         *
         * @param x перемещение по координате Х
         * @param y перемещение по координате Y
         * @return обновленная {@link Point}
         */
        public PointMutate translate(double dx, double dy) {
            x += dx;
            y += dy;
            return this;
        }

        /*
         * Изменение масштаба по обеим координатам заданный коэффициент
         *
         * @param k коэффициент умножения
         * @return обновленная {@link Point}
         */
        public PointMutate scale(double factor) {
            x *= factor;
            y *= factor;
            return this;
        }
    }
}

