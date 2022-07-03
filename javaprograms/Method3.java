package javaprograms;

public class Method3 {

	public void add (int a, float b) {
		System.out.println(a+b);
	}
	public void sub(float c,double d) {
		System.out.println(c-d);
	}
	public void hi () {
		System.out.println("I am sowjanya");
	}
	public static void main(String[] args) {
		
     Method3 M3 = new Method3();
     M3.add(24, 25.6f);
     M3.sub(25.6f, 23.67);
     M3.hi();
	}

}
