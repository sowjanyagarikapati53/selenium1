package exceptions;

public class Tc {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(Exception e) {
			
			System.out.println(a/(b+2));
			
			
		}
	}

}
