package javaprograms;

public class MethodOverloading {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(10,20);
		add(20,10,50);
		
	}

}
