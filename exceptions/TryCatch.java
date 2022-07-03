package exceptions;

public class TryCatch {
	
public static void main(String[] args) {
	int a=20;
	int b=0;
	try {
		int c=a/b;
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e.toString());
		System.out.println(e.getMessage());
		
	}
	System.out.println("rest of the code");
		

	}

}
