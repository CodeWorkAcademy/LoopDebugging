package com.company;
import java.util.Scanner;

public class StopSayingThatSolution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userInput = " ";

        System.out.println("Say something");
        userInput=keyboard.next();
        System.out.println(userInput);
        while ( userInput != "" )
        {   System.out.print("Say something else");
            userInput = keyboard.next();
            System.out.println(userInput);
        }
    }
}
