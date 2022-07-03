package exceptions;

public class Tc4 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();//
			//System.out.println(e.getMessage())
			try {
				int s[]= new int [10];

			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1.getMessage());

			}

		}

	}

}
