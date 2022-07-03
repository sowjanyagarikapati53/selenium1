package practice;

public class SwapWithoutThirdVar 
{

	public static void main(String[] args)
	{
		int x =20;
		int y =50;
		//with 3 rd var
//		int temp;
//		temp=x;
//		x=y;
//		y=temp;
		
		//without 3rd var 
//		x=x+y;//70
//		y=x-y;//70-50=20
//		x=x-y;//70-20=50
		
		x=x*y;//1000
		y=x/y;//20
		x=x/y;//50
		
		System.out.println(x);
		System.out.println(y);
	}

}
