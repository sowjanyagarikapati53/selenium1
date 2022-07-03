package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample {
   
	
	     public void add(int a, int b)throws ArithmeticException {
	    	 
	    	 
	    	 System.out.println(a/b);
	     }
	     
	     public void m1(String s) {
	    	 System.out.println(s.length());
	    	 
	     }
	     public void m2() throws FileNotFoundException {
	    	 FileReader f=new FileReader("C:\\\\Users\\\\shekar\\\\Desktop\\\\sowjanya\\\\javaclass\\\\src\\\\javaprograms\\\\B.java");
	     }
	     
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Sample s= new Sample();
		//s.add(1, 0);
		//System.out.println("hello");
		s.m2();
				
		
		

	}

}
