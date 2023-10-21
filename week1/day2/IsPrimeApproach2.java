package week1.day2;

public class IsPrimeApproach2 {

	public static void main(String[] args) {
		
		int num = 2;
		
		boolean Value = false;
		
		for (int i = 2; i <= num/2; i++) {
			
			if (num%i==0) {
				
				Value = true;
				break;
			}
				
		}
		if (!Value) {
			System.out.println("The number is not prime");
			
		} else {
			
			System.out.println("The number is Prime number");

		}
		

	}

}
