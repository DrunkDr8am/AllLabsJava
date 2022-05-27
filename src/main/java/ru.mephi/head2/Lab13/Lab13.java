package ru.mephi.head2.Lab13;


import liquibase.repackaged.com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Загрузите архивный ]AR-файл с библиотекой OpenCSV по адресу h t t p : / /
 * o p e n c s v . s o u r c e f o r g e . n e t . Напишите класс с методом m a in ( ) для чтения избранных файлов формата CSV
 * и вывода некоторого их содержимого. Соответствующий образец кода можно найти на веб-сайте библиотеки OpenCSV по
 * указанному выше адресу. А поскольку вы еще не научились обрабатывать исключения, го воспользуйтесь следующим заголовком для метода m a in ():
 * public static void main(String[] args) throws Exception
 */


public class Lab13 {
    public static void main(String[] args) {


        List<Person> arr;

        try (FileReader reader = new FileReader("src/main/resources/biostats.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            arr=(csvReader.readAll().stream()
                    .map(s->new Person(s))
                    .collect(Collectors.toList()));
            for (Person person :
                    arr) {
                System.out.println(person);
            };
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

