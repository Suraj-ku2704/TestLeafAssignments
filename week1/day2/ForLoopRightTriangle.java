package week1.day2;

import java.util.Scanner;

public class ForLoopRightTriangle {

	public static void main(String[] args) {
		
		//Print triangle of numbers
	
		System.out.println("Enter the number of rows:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			
			//System.out.println("Outerloop "+i);
			
			for (int j = 1; j <= i ; j++) {
				
				
				System.out.print(j);
				
				
			}
			System.out.println("");
			
		}

	}

}
