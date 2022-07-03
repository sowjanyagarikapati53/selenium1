package javaprograms;

public class A1 {
	int a=10;
	int b=20;
	 static int c=35;
	public static void main(String[] args) {
		A1 x=new A1() ;
		x.a=15;
		x.b=10;
		x.c=45;
		System.out.println(x.a+x.b+x.c);
		A1 z=new A1();
		System.out.println(z.a+z.b+z.c);
			
		
		
	}

}
