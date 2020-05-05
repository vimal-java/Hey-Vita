package basics.programs;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int input = 787;
		int sum = 0;
		int i = 1;
		
		for ( i = 1; i <=input; i++) {
			
			sum = sum + input%10;
			input = input /10;
		}
		
		System.out.println(sum);
	}

}
