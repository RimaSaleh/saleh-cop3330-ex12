/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initializing doubles for the worth
        double interest_worth, worth;

        //print statement asking for the principal to be inputted
        System.out.println( "Enter the principal: " );
        //number will be inputted and stored as "principal"
        int principal = scanner.nextInt();

        //print statement asking for rate of interest to be inputted
        System.out.println( "Enter the rate of interest: " );
        //number will be inputted and stored as "interest"
        double interest = scanner.nextDouble();

        //print statement asking for number of years to be inputted
        System.out.println( "Enter the number of years: " );
        //number will be inputted and stored as "years"
        int years = scanner.nextInt();

        //calculating the worth of investing
        interest_worth = interest * principal /100;
                worth = (interest_worth * years) + principal;

        //output of investment worth
        System.out.format( "After %d years at %.2f %% the investment will be worth $%.2f.", years, interest, worth );
    }
}
