package javaprograms;

public class palindrome {

	public static void main(String[] args) {
		int n= 432;
		int temp=n;
		int rev=0;
		int r;
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
		    temp=temp/10;
		    
		}
		if(n==rev) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}

	}

}
