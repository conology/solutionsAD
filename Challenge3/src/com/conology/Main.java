package com.conology;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Write a method that returns a comma separated string based on a given list of integers. Each element should be
    preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example,
    if the input list is (3,44), the output should be 'o3,e44'.
     */
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(2);
        //add two integers
        input.add(0,3);
        input.add(1,44);
        //call the mentioned method
        System.out.print(getString(input));
    }

    public static String getString(List<Integer> list) {
        StringBuilder sb = new StringBuilder(10);
        sb.append(list.get(0)%2 == 0 ? 'e' : 'o');
        sb.append(list.get(0)+",");
        // your method here!
        sb.append(list.get(1)%2 == 0 ? 'e' : 'o');
        sb.append(list.get(1));
        return sb.toString();
    }
}
