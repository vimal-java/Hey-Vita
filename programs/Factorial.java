package basics.programs;

public class Factorial {

	public static void main(String[] args) {
		 
		int input = 5;
		int i = 1;
		int fact = 1;

		for ( i = 1; i <=input; i++) {
			
			fact = fact*i;
		
	}
		System.out.println("Output is " +fact);

}
}