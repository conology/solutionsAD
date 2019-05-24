package com.conology;

import java.util.Scanner;

public class Main {
    /*User input integer values in 10 cell array.
    He wants to find product of greatest and smallest number present in array.
    */
    public static void main(String[] args) {
        //User inputs 10 numbers (integers)
        Scanner sc = new Scanner(System.in); //prepare to read 10 ints
        //Reserve space for 10 numbers.
        int[] input = new int[10];


        //Loop and input
        int commited = 0;
        while(commited != 10){
            if(sc.hasNextInt()){
                input[commited] = sc.nextInt();
                commited ++;
            }
            else
                sc.nextLine(); //if no nextInt you clear the scanner.
        }

        /*print input.
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }*/
        //get product greatest
        int biggest = getBiggestElement(input);
        //get product smallest
        int smallest = getSmalestElement(input);
        //multiply them together.
        System.out.println(smallest*biggest);
    }

    public static int getBiggestElement(int[] table){
        int max = Integer.MIN_VALUE; // public static final int
        //loop with for loop
        for(int i = 0; i < table.length; i++){
            if(table[i]> max)
                max = table[i];
        }
        return max;
    }

    public static int getSmalestElement(int[] table){
        int min = Integer.MAX_VALUE; // public static final int
        //loop with foreach
        for(int i : table)
            if(i < min)
                min = i;
        return min;
    }
}
