package interfaces;

public class S2 implements Animal {
	public void eat() {
		System.out.println("eating");
	}
	public void drink() {
		System.out.println("drinking");
	}

	public static void main(String[] args) {
		S2 s=new S2();
		s.drink();
		s.eat();
		
	}

}
