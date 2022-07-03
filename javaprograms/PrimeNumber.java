package javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int a=12;
		int count=0;
		for(i=2;i<a;i++) {
			 
		
			if(a%i==0) {
				count++;
				break;
			}
		}
			if(count==0) {
				System.out.println("given number is prime number");
				
			}
			else {
				System.out.println("given number is not a prime number");
			}
		
				
		
		
	}

}
