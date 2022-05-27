package ru.mephi.head2.Lab13;

public class Person {

    private String name;
    private Character sex;
    private int age;
    private int height;
    private int weight;

    public Person(){
        this.name="NoName";
        this.sex='N';
        this.age=0;
        this.height=20;
        this.weight=20;
    }

    public Person(String[] arr){
        if(arr.length!=5)
            throw new RuntimeException();
        this.name = arr[0];
        this.sex=arr[1].charAt(0);
        this.age=Integer.parseInt(arr[2]);
        this.height=Integer.parseInt(arr[3]);
        this.weight=Integer.parseInt(arr[4]);

    }


    public Person(String name, Character sex, int age, int height, int weight) {
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
