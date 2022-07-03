package javaprograms;

public class Method1 {
	public void add1(int a, int b) {
		System.out.println(a+b);
		}
public void add2(float a ,float b) {
	System.out.println(a+b);
}
public void add3(double a,double b) {
	System.out.println(a+b);
}
public void sub1(int c,int d) {
	System.out.println(c-d);
	}
public void sub2(float c,float d) {
	System.out.println(c-d);
	
}
public void sub3(double c,double d) {
	System.out.println(c-d);
}
public void multi1(int e, int f) {
	System.out.println(e*f);
	
}
public void multi2(float e,float f) {
	System.out.println(e*f);
}
public void multi3(double e, double f) {
	System.out.println(e*f);
}

	public static void main(String[] args) {
	
		Method1 M1= new Method1();
	M1.add1(45, 55);
	M1.add2(24.5f, 44.3f);
	M1.add3(2.33, 6.78);
	M1.sub1(97, 67);
	M1.sub2(9.3f, 7.8f);
	M1.sub3(0.02, 7.67);
	M1.multi1(78, 22);
	M1.multi2(3.3f, 4.5f);
	M1.multi3(4.55, 3.33);

	}

}
