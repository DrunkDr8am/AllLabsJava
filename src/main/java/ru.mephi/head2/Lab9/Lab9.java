package ru.mephi.head2.Lab9;

/*
 Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом
 топливе по оси х. Предоставьте методы для передвижения автомобиля на
 заданное количество километров, заполнения топливного бака заданным
 количеством литров бензина, вычисления расстояния, пройденного от начала
 координат, а также уровня топлива в баке. Укажите расход топлива (в км/л)
 в качестве параметра конструктора данного класса.
 Должен ли этот класс быть неизменяемым и почему?
 */


public class Lab9 {
    public static void main(String[] args) {
        Car dodgeChallenger = new Car(75, 8, 50);
        dodgeChallenger.addFuel(5);
        System.out.println(dodgeChallenger.getFuel());
        dodgeChallenger.addFuel(100);
        System.out.println(dodgeChallenger.getFuel());
        dodgeChallenger.move(550);
        System.out.println(dodgeChallenger.getFuel());
        System.out.println(dodgeChallenger.getX());
    }
}
