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

public class Car {

    private double x;
    private double fuel;
    private final int maxFuel;
    private final double consumption;

    public Car(int maxFuel, double consumption) {
        if (consumption < 0)
            throw new RuntimeException("Consumption < 0!");
        this.x = 0;
        this.fuel = 0;
        this.maxFuel = maxFuel;
        this.consumption = consumption;
    }

    public Car(int maxFuel, double consumption, double fuel) {
        this(maxFuel, consumption);
        addFuel(fuel);
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public boolean move(double x) {
        double length;
        double spendFuel = x / consumption;
        if (spendFuel < 0) {
            spendFuel = -spendFuel;
        }
        if (fuel <= spendFuel) {
            double s = fuel * consumption;
            fuel = 0;
            length = s;
        } else {
            fuel -= spendFuel;
            length = x;
        }
        if(x<0){
            length=-length;
        }
        this.x += length;
        return length == x;
    }

    public void addFuel(double fuel) {
        if (fuel<=0)
        {
            throw new RuntimeException("car need fuel!");
        }
        if (fuel + this.fuel > maxFuel) {
            double remains = fuel - this.fuel;
            this.fuel = maxFuel;
            System.out.println("the tank is completely filled ! the remaining fuel is equal to " + remains);
        }
        else {
            this.fuel += fuel;
        }
    }
}