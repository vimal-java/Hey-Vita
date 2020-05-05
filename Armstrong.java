package basics.assignments;

public class Armstrong {

	public static void main(String[] args) {
		
		int input = 153;
		
		int calculated = 0;
		
		int remainder;
		
		int original  = input;
		
		
	while (input>0) {
		
		remainder = input%10;
		input = input/10;
		calculated = (remainder*remainder*remainder)+ calculated;
		
	}
		
		if (calculated == original) {
			
			System.out.println("Armstrong number");
			
		} else {
			
			System.out.println("Not an armstrong number");

		}

	}

}
