package javaprograms;

public class Sum {

	public static void main(String[] args) {
		int n=535;
		int sum=0;
		int temp;
		while(n>0) {
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println(sum);
	}

}
