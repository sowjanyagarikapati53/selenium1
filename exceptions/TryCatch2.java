package exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			e.getMessage();
			e.toString();
		}
		System.out.println("rest of the code");

	}

}
