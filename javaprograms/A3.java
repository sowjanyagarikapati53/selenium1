package javaprograms;

public class A3 {
	public void m1() {
		int a=30;
		int  b=20;
		System.out.println(a+b);
		m2();
	}
	public static void m2() {
		int a=20;
		int b=40;
		System.out.println(a-b);
		
		
	}
	public static void m3() {
		int a=50;
		int b=20;
		System.out.println(a*b);
		
	}
	

	public static void main(String[] args) {
		A3 x=new A3();
		x.m1();
		m3();
		
	}

}
