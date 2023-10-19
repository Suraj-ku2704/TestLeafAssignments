package week1.day2;

import java.util.Scanner;

public class ForLoopPyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		
		for (int i = 1; i <= rows; i--) 
		{
			
			for ( int j = rows-i; j >= i ; j--) 
			{
				
				
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
				
			}
			

			System.out.println("");
			
		}



	}

}
