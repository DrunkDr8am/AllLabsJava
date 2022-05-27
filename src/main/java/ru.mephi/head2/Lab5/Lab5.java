package ru.mephi.head2.Lab5;

public class Lab5 {
    /**
     * Реализуйте неизменяемый класс P o in t , описывающий точку на плоскости.
     * Предоставьте его конструктор, чтобы задать конкретную точку; конструктор
     * без аргументов, чтобы задать точку в начале координат; а также методы g e t X (),
     * g e tY (), t r a n s l a t e ( ) и s c a l e ( ) . В частности, метод t r a n s l a t e () должен перемещать точку на определенное расстояние в направлении координат х и у, а
     * метод s c a le () — изменять масштаб по обеим координатам на заданный коэффициент. Реализуйте эти методы таким образом, чтобы они возвращали новые
     * точки в качестве результата. Например, в следующей строке кода:
     * Point р = new Point(3, 4).translate(1, 3).scale(0.5);
     * в переменной р должна быть установлена точка с координатами (2, 3,5).
     */
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("[x=%s;y=%s]", p.getX(), p.getY());
    }

    /*
     * Класс точки для двумерной координатной оси
     *
     * @author Zeluakov Andrei
     * @version 1.1
     */
    private static class Point {
        private final double x;
        private final double y;

        /*
         * Конструктор без параметров.
         * Создает точку в координате (0;0)
         */
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        /*
         * Конструктор по определенным координатам
         *
         * @param x координата по оси Х
         * @param y координата по оси Y
         */
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /*
         * Получить координату точки по оси Х
         *
         * @return координата по оси Х
         */
        public double getX() {
            return x;
        }

        /*
         * Получить координату точки по оси Y
         *
         * @return координата по оси Y
         */
        public double getY() {
            return y;
        }

        /*
         * Перемещение точки на определенное расстояние в направлении координат x и y
         *
         * @param x перемещение по координате Х
         * @param y перемещение по координате Y
         * @return результирующая точка
         */
        public Point translate(double dx, double dy) {

            return new Point(getX() + dx, getY() + dy);
        }

        /*
         * Изменение масштаба по обеим координатам заданный коэффициент
         *
         * @param k коэффициент умножения
         * @return результирующая точка
         */
        public Point scale(double factor) {

            return new Point(getX() * factor, getY() * factor);
        }

    }
}

