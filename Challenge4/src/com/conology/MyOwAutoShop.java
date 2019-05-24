package com.conology;

public class MyOwAutoShop {
    /*

5) Create MyOwnAutoShop class which contains the main() method. Perform the following within the main() method:
    Create an instance of Mercedes class and initialize all the fields with appropriate values. User super(...) method
    in the constructor for initializing the fields of the superclass.
    Create two instances of the Prosche class and initialize all the fields with approptiate values. Use super(...)
    method in the constructor for initalizing the fields of the super class.
    Create an instance of Car class and initalize all the fields with appropriate values.
    Display the sales price of all instances.*/

    public static void main(String[] args) {
	// write your code here
        //Create an instance of Mercedes class and initialize all the fields with appropriate values. User super(...)
        // method in the constructor for initializing the fields of the superclass.

        Mercedes m = new Mercedes(2000,220,25_000d,"Blue");

        Porsche p1 = new Porsche(1987,22,33_000d, 240,"Red");
        Porsche p2 = new Porsche(1990,5,31_000d, 240,"Yellow");

        Car c = new Car(140,5_000d,"Gray");

        System.out.println(m.getSalePrice());

        System.out.println(p1.getSalePrice());
        System.out.println(p2.getSalePrice());

        System.out.println(c.getSalePrice());
    }
}
