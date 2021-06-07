package org.example;

import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        System.out.print( "What is the principal amount? ");
        int principal = Integer.parseInt(Obj.nextLine());
        System.out.print( "What is the rate? ");
        double rate = Double.parseDouble(Obj.nextLine());
        System.out.print( "What is the number of years? ");
        int years = Integer.parseInt(Obj.nextLine());
        System.out.print( "What is the number of times the interest is compounded per year? ");
        int compoundFreq = Integer.parseInt(Obj.nextLine());

        //A = P(1 + r/n)^(n*t)
        double total = principal*Math.pow((1 + ((.01*rate)/compoundFreq)), (compoundFreq*years));

        //System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.", years, rate, total);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, rate, years, compoundFreq, total);

    }
}