package com.conology;
/*
   1) Create a super class called Car. The Car class has the following fields and methods:
    int speed;
    double regularPrice;
    String color;
    double getSalePrice();
 */
public class Car {
    private int speed;
    protected double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public Car(){
        this.speed = 0;
        this.regularPrice = 0d;
        this.color = "";
    }

    public double getSalePrice(){
        return regularPrice*1.22d;
    }
}
