package ex_09_Switch;

import java.util.Scanner;

public class Lab099_Assignment {
    public static void main(String[] args) {
        //Please do this assignment program for us
        //CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.

        // Create a Scanner object for reading input
        Scanner sc=new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter Your name");
        String name = sc.nextLine();


        System.out.println("Enter Your Age");
        int age= sc.nextInt();

        // Prompt the user for their salary
        System.out.println("Enter Your Salary");
        double salary= sc.nextDouble();

        // Print the collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

        // Close the scanner
        sc.close();

    }
    }

//Output
//Enter Your name
//        Aswathy
//Enter Your Age
//27
//Enter Your Salary
//40000
//
//        --- User Information ---
//Name:Aswathy
//Age:27
//Salary:40000.0
