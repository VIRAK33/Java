package com.i4.itc;

public class Car {

    Byte wieght;
    String color;
    String model;

    Car(Byte wieght, String color, String model){
        this.wieght = wieght;
        this.color = color;
        this.model = model;
    }

    public static void main(String [] args) {
        Car obj1 = new Car((byte) 2, "white", "Audi");
        System.out.println(obj1.color+"\t"+obj1.model +"\t"+ obj1.wieght);
    }
}
