package week1.day2;

import java.util.Scanner;

public class CheckFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the MaxRange:");
		int maxRange = scanner.nextInt();

		int  j = 1;
		
		for (int i = 0; j <=maxRange ; ) {
				
				
		int	sum = i + j;
			
			System.out.print(i +",");
			
			i = j;
			
			j = sum;
			
			
		}
			
		
	}

}
