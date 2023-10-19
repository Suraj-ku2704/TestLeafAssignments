package week1.day2;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int input = scanner.nextInt();
		
		Palindrome palindrome = new Palindrome();
		
		int output = palindrome.CheckPalindrome(input);
		
		if (input == output) {
			
			System.out.println("  The number is palindrome");
		} else {
			System.out.println("  The number is NOT palindrome");

		}
		
	}
	
	public int CheckPalindrome(int input)
	{
		
		
		int output = 0;
		for (int i = input; i > 0; ) {
			
			
			 int rem = i%10;
			 
			System.out.print(rem);
			
			i = i/10;
			
			output = output*10+rem;
		
		}
		
		return output;
	}
	

}
