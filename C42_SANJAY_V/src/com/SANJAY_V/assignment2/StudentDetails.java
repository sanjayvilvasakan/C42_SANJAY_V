package com.SANJAY_V.assignment2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter your full name with Initial:");
        String fullName = sc.nextLine();

        System.out.println("Enter your roll number:");
        String rollNumber = sc.nextLine();

        System.out.println("Enter your grade:");
        String grade = sc.nextLine();

        System.out.println("Enter your percentage:");
        String percentage = sc.nextLine();

        
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);

    }
}