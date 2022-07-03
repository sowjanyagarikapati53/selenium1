package javaprograms;

import java.util.Scanner;

public class Sample2 {
	public int add () {
		Scanner  s =new Scanner(System.in);
		int a,b;
		
		System.out.println("enter a,b values");
		a=s.nextInt();
		b=s.nextInt();
		return a+b;
	}
	

	public static void main(String[] args) {
		
		Sample2 s2 =new Sample2();
		int c=s2.add();
		System.out.println(c);
		
		
		
	}

}
