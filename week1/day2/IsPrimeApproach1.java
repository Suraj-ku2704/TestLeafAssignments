package week1.day2;

import java.util.Scanner;

public class IsPrimeApproach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     System.out.print("Enter number n:");
	     @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	     int n = scanner.nextInt();
	     
		for (int i = 2; i <= n-1 ; i++) {
			
			if (i%2!=0)  
			{
				System.out.println(i +" is Prime");
			}
				
			
		}


	}

}
