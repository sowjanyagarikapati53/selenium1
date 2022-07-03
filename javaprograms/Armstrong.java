package javaprograms;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int r;
		int temp=n;
		int sum=0;
		while(n>0) {
			r=n%10;
			r = r*r*r;
			sum=sum+r;
			n=n/10;
			
		}
		if(sum==temp) {
			System.out.println("given number is amstrong number");
			
		}
		else {
			System.out.println("given number is not amstrong number");
		}
	}

}
