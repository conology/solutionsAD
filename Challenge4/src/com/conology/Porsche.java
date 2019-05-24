package com.conology;
/*
3) Create a subclass of Car class and name it as Prosche. The Porsche class has the following fields and methods:
        int year;
        in manufacturerDiscount;
        double getSalePrice();*/

public class Porsche extends Car {
    private int year;
    private int manufacturerDiscount;

    public Porsche(int year, int manufacturerDiscount, double regularPrice, int speed, String color){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public Porsche(){
        super();
        this.year = 0;
        this.manufacturerDiscount = 0;
    }

    @Override
    public double getSalePrice(){
        double salePrice = super.getSalePrice();
        return salePrice - (salePrice *(double)manufacturerDiscount/100);
    }
}
