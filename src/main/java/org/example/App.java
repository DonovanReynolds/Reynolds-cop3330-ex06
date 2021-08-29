package org.example;


import java.util.Calendar;
import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 6 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        Calendar calendar = Calendar.getInstance();
        String ageText = inputOutput("What is your current age?");
        String retireText = inputOutput("At what age would you like to retire?");

        int age = Integer.parseInt(ageText);
        int retire = Integer.parseInt(retireText);

        int timeLeft = retire - age;

        if (timeLeft <= 0)
        {
            System.out.println("You can retire right now!");
            return;
        }
        int year = calendar.get(Calendar.YEAR);
        int yearLeft = year + timeLeft;

        System.out.println("You have " + timeLeft + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + yearLeft);

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        String temp = input.nextLine();
        return temp;
    }
}
