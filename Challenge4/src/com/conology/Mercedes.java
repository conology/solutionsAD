package com.conology;
/*
4) Create a subclass of class Car class and name it as Mercedes. The Mercedes class has the following fields and methods:
    int length;
    double getSalePrice();
 */
public class Mercedes extends Car {
    private int length;

    public Mercedes(int length, int speed, double regularPrice, String color){
        super(speed,regularPrice,color);
        this.length = length;
    }

    public Mercedes() {
        this.length = 0;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice();
    }
}
