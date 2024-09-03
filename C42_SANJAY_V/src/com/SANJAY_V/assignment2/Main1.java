package com.SANJAY_V.assignment2;

import java.util.Scanner;

class Commission {
    
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
         name = sc.nextLine();

        System.out.print("Enter Address: ");
         address = sc.nextLine();

        System.out.print("Enter Phone: ");
         phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
         salesAmount = sc.nextDouble();
    }


    public void calculateCommission() {
        if (salesAmount >= 100000) 
        {
            commission = 0.10 * salesAmount;
        }
        else if (salesAmount >= 50000 && salesAmount < 100000)
        {
            commission = 0.05 * salesAmount;
        } 
        else if (salesAmount >= 30000 && salesAmount < 50000) 
        {
            commission = 0.03 * salesAmount;
        }
        else
        {
            commission = 0;
        }
    }

  
    public void displayDetails() {
        System.out.println("\nSales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}

public class Main1 {
    public static void main(String[] args) {
        
        Student student = new Student();

        
        Commission Obj = new Commission();

       
        Obj.acceptDetails();
        Obj.calculateCommission();
        Obj.displayDetails();
    }
}


