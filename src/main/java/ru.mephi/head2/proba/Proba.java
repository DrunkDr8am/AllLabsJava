package ru.mephi.head2.proba;

import ru.mephi.head2.Task2.Point;

public class Proba {
    private final int d=0;
    private int a = 1;
    private int b = 2;
    private int c = 3;
    static int count;

    {
        c = 15;
    }

    public Proba() {
    }

    public Proba(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Proba(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public static void staticCounter(){
        count++;
    }

    public void instanceCounter(){
        count++;
        a=0;
    }

    @Override
    public String toString() {
        return "Proba{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
