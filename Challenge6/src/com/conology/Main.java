package com.conology;

public class Main {
    /*
    Given two strings, base and remove, return a version of the base string where all instances of the remove string
    have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only
    non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"
    */
    public static void main(String[] args) {
	// write your code here
        String s = withoutString("Hello there", "x");
        System.out.println(s);
    }

    public static String withoutString(String whole, String remove){
        return whole.replaceAll(remove,"");
    }
}
