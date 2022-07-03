package collection;

import java.util.*;

public class ArrayAdd
{

	public static void main(String[] args)
	{
		ArrayList<String> a= new ArrayList<String>();
		a.add("s");
		a.add("o");
		a.add("w");
		a.add("j");
		System.out.println("after invoking add(E e):"+a);
		a.add(4, "a");
		System.out.println("after adding new string:"+a);
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("n");
		a1.add("y");
		a.add("a");
		a.addAll(a1);
	   System.out.println("after adding a1 to a:"+a);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("good");
		a.addAll(a2);
		System.out.println("new arraylist is:"+a);
		
	}

}
