package javaprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int i;
		int n=150;
		
		for( i=2;i<=n;i++) {
			int count = 0;
			for(int j =2;j<i-1;j++) {
				
			
				if(i%j==0) {
					
				count++;
				break;
			
				}
			}
			
			if(count==0) {
			
				System.out.println(i);
				
				}
			}
			}
			}
			
		
		
	


