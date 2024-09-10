package com.SANJAY_V.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScore {
		
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of test scores: ");
	        int n = scanner.nextInt();

	        int[] testScores = new int[n];
	        System.out.print("Enter the test scores: ");
	        for (int i = 0; i < n; i++) {
	            testScores[i] = scanner.nextInt();
	        }

	        ArrayList<Integer> testScoresList = new ArrayList<>();
	        for (int score : testScores) {
	            testScoresList.add(score);
	        }

	        System.out.println("Elements in the ArrayList:");
	        for (int score : testScoresList) {
	            System.out.println(score);
	        }

	        scanner.close();

	}

}