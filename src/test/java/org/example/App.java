/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */


package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Hello, What is your name? ");
        String name = input.next();
        System.out.println("Hello "+name+", nice to meet you!");
    }


}
