package week1.day2;

public class PractiseContinue {

	public static void main(String[] args) {

		//Print 1 to 10 and when equal to 3 print "Three" and then continue 
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 3) {
				
				System.out.println("Three");
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
