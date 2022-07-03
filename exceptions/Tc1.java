package exceptions;

public class Tc1 {

	public static void main(String[] args) {
		try {
		int arr[]=new int [5];
		
		arr[7]=20;
	}
		
		
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		     System.out.println(e.getMessage());
		     System.out.println(e.toString());
		}
			
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		     System.out.println(e.getMessage());
		     System.out.println(e.toString());
		}
		catch (Exception e) {
		     e.printStackTrace();
		     System.out.println(e.getMessage());
		     System.out.println(e.toString());
		}
		System.out.println("array out of bounds");
		}
	}
	
		
		   



