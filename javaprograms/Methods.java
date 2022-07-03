package javaprograms;

public class Methods {
	
	public void addition (int a, int b )
	
	{
	
	System.out.println(a+b);
	}
	public void sub(int c,int d) {
		System.out.println(c-d);
		
		
	}
	public void multiply(float s, float p) {
		System.out.println(s*p);
	}
	public void division(int q,int r) {
		System.out.println(q/r);
	}
	
	public static void main(String[] args) {
	
		 Methods M = new Methods ();
		 M.addition(50, 25);
		 M.sub(100, 70);
		 M.multiply(2.3f, 7.6f);
         M.division(4,2);
	}

}
