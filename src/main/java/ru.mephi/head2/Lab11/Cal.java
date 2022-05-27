package ru.mephi.head2.Lab11;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Cal {

    private int year;
    private int month;

    private Cal() {
    }

    public static Cal of(int year, int month) {
        Cal calendar = new Cal();
        calendar.year = year;
        calendar.month = month;
        return calendar;
    }

    public  void print() {
        LocalDate date = LocalDate.of(year, month, 1);
        int monthValue = date.getMonthValue();
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4s", DayOfWeek.of((i + 6) % 7 + 1).toString().substring(0, 3));
        }
        System.out.println();
        for (int i = 1; i < date.getDayOfWeek().getValue() + 1; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == monthValue) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }

    public static void  show(){
        Cal.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue()).print();
    }

}

