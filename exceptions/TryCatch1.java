package exceptions;

public class TryCatch1 {

	public static void main(String[] args) {
		try {
		int arr[]= new int[5];
		arr[10]=20;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("30");
		

	}

}
