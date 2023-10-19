package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		int maxRange = 10;
		
		for (int a = 1; a <= maxRange; a++) {
			if (a%2 == 1) {
				
				System.out.println(a + " is Odd number");
				continue;
			}
			System.out.println(a);
			
		}
		

	}

}
