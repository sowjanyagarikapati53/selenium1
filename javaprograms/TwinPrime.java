package javaprograms;

public class TwinPrime {

	public static void main(String[] args) {
		
		int prev=1;
		int n=150;
		for (int i=2;i<n;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				
				if(i%j==0) {
					count=1;
					break;
				}
			}
			
			
				if(count==0) {
					if(i-prev==2) 
						System.out.println(prev+" "+i);
						prev=i;
					}
						
					}
				
				}
			}
		

		
	




