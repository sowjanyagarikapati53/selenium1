package javaprograms;

public class Return {
	public int add (int a, int b)
	{
		int c= a+b;
		return c;
	}
     public float add (int d, float e) {
    	 float f= d+e;
    	 return f;
    	 
     }
	public static void main(String[] args) {
		Return R= new Return ();
		int X = R.add(25, 35);
		System.out.println(X);
        float Y =R.add (55, 22.5f);
        System.out.println(Y);
	}

}
