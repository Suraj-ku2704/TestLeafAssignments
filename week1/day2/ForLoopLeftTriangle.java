package week1.day2;

import java.util.Scanner;

public class ForLoopLeftTriangle {

	public static void main(String[] args) {
		

		System.out.println("Enter the number of rows:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		int j;
		for (int i = rows; i >= 1; i--) {
			
			//System.out.println("Outerloop "+i);
			
			for ( j = 1; j <= i-1 ; j++) {
				
				
				System.out.print(" ");
				
			}
			
			for (; j <= rows; j++) {
				System.out.print("*");
				
			}
			

			System.out.println("");
			
		}

	}

}
