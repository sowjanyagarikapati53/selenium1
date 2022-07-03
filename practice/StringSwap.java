package practice;

public class StringSwap 
{

	public static void main(String[] args) 
	{
		String a="sowjanya";
		String b = "garikapati";
		
		System.out.println("before swaping .....");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is :"+b);
//		String temp;
//		temp=a;
//		a=b;
//		b= temp;
		a=a+b;//sowjanyagarikapati
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after swaping .....");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is :"+b);
	}

}
