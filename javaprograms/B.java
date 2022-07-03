package javaprograms;

public class B {
	void add() {
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=40;
		int b=50;
		System.out.println(a-b);
	}
}
	class C extends B{
		void mul() {
			int a=40;
			int b=2;
			System.out.println(a*b);
		}
	}
	class D extends C{
		void div() {
			int a=30;
			int b=15;
			System.out.println(a/b);
		}
	}

	


