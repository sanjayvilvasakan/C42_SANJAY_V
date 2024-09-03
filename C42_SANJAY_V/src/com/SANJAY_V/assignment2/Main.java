package com.SANJAY_V.assignment2;

import java.util.Scanner;

class Circle {
    public double radius;
    public String color;


    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the colour of the circle: ");
        color = scanner.nextLine();
    }

 
    public void calc() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
 
        Circle obj = new Circle();

        obj.getInput();
        obj.calc();
       
		
    }
  
}