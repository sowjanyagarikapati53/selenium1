package exceptions;

public class Tc2 {

	public static void main(String[] args) {
		try {
			try {
				int a= 20/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
			try {
				int b[]=new int[5];
				b[7]=50;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		
		System.out.println("other statements");
	}

}
