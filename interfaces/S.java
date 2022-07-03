package interfaces;



public class S implements Printable {
	public void print() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		S obj= new S();
		obj.print();
		
	}

}
