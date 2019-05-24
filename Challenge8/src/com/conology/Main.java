package com.conology;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    Design and implement an application that plays the Rock Paper Scissors game against the computer
The program should randomly choose one of the three options, then prompt the user’s selection.
At that point, the program reveals both choices and prints a statement indicating if the user won, the computer won or
 if it is a tie. Continue playing until user chooses to stop, then print the number of wins, losses, and ties.
     */
    public static void main(String[] args) {
        //loop until user stops
        boolean loop = true;
        while(loop) {


            //randomly select rock paper scissors
            String cpu = rockPaperScissors();
            //System.out.println(rockPaperScissors());

            //prompt user for selection
            String user = new Scanner(System.in).next();

            //Results
            System.out.println("User: " + user + "\nCPU: " + cpu);

            //Winner
            System.out.println(decideWinner(user, cpu));

            //Ask user if he wants to play again.
            System.out.println("Want to play again?");
            //stikalo za izkljucitev neskoncnega loopa.
            if(new Scanner(System.in).next().equals("No"))
                loop = false;
        }
    }

    public static String rockPaperScissors(){
        Random r = new Random();
        String[] options = new String[]{"Rock", "Paper", "Scissors"};
        return options[r.nextInt(3)];
    }

    public static String decideWinner(String first, String second){ //first == loser, second == cpu
        if(first.equals(second)){
            return "Tie, but I'm obviously on to you.";
        }
        if(first.equals("Rock") && second.equals("Scissors") || first.equals("Scissors") && second.equals("Paper") || first.equals("Paper") && second.equals("Rock")){
            return "User won :S ...";
        }
        return "Computer won!";
    }

}

