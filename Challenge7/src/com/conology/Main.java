package com.conology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

    countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1
     */
    public static void main(String[] args) {
        //declare an array of ints
        ArrayList input = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
        //call countClumps
        int nrOfClumps = countClumps(input);
        System.out.println(nrOfClumps);
    }

    public static int countClumps(ArrayList<Integer> list){
        int first = list.get(0);
        int counter = 0, finNr = 0;
        for(int i = 1; i<list.size();i++){
            if(first == list.get(i)){
                counter++;
            } else{
                if(counter > 0)
                    finNr++;
                counter = 0;
            }
            first = list.get(i);
        }
        return counter > 0 ? finNr+1 : finNr;
    }
}
