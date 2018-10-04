package exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [] arrayNums = new double[20];
		double total = 0;
		int i = 0;
		double average = 0;
		int quit = 0;
		
		while(quit != 99999 ) {
			System.out.println("Enter a number");
			arrayNums[i] = input.nextDouble();
			
			total = total + arrayNums[i];
			average = total / arrayNums.length;
			
			System.out.println("To quit enter 99999, or another number.");
			quit = input.nextInt();
			
			
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		

	}

}
