package com.conology;

import java.util.Scanner;

public class Main {
    /*
    Ask a user for a ID number. The correct input for a id number is 10 in length and they must all be numbers.
    If not throw an exception
     */
    public static void main(String[] args) {
	    //Input ID number
        Scanner sc = new Scanner(System.in);
        //Check if id number is 10 in length and a number

        boolean flag = true;
        while(sc.hasNextLine()){
            String check = sc.nextLine();
            //check if input contains only numbers
            for(char c : check.toCharArray()){
                if(!Character.isDigit(c)) {
                    System.out.println("incorrect");
                    flag = false;
                    break;
                }
            }
            //If the flag was set to incorrect in the upper if statement, then reset flag and skip the code under
            if(!flag) {
                flag = true;
                continue;
            }
            //check if site == 10
            if(check.length() == 10)
                System.out.println("correct");
            else
                System.out.println("incorrect");
        }
    }
}
