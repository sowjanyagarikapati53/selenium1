package exceptions;

public class TryCatch3 {

	public static void main(String[] args) {
		int a=30;
		int b=0;
		try {
		int c=a/b;
		}
	catch(ArrayIndexOutOfBoundsException e)	{
		e.getMessage();
		e.printStackTrace();
		e.toString();
	}
		catch(NullPointerException e) {
			e.printStackTrace();
			e.toString();
			e.getMessage();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println(a+b);

	}

}
