package com.conology;
/*
2) Create a sub class and name it as Truck. The Truck class has the following fields and methods:
    in weight;
    double getSalePrice();
 */
public class Truck extends Car {
    private int weight;

    public Truck(){
        super();
        this.weight = 0;
    }

    @Override
    public double getSalePrice(){
        return regularPrice*1.5d;
    }

}
