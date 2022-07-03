package collection;

import java.util.ArrayList;

public class Remove 
{

	public static void main(String[] args)
	{

		ArrayList<String> a= new ArrayList<String>();
		a.add("s");
		a.add("o");
		a.add("w");
		a.add("j");
		System.out.println("after invoking add(E e):"+a);
		a.remove( "w");
		System.out.println("after removing new string:"+a);
		a.remove(0);
	   System.out.println("after removing :"+a);
	   
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("n");
		a1.add("y");
		a.addAll(a1);
		System.out.println("new arraylist is:"+a);
		a.removeAll(a1);
		System.out.println("After removing a1:"+a);
		a.clear();
		System.out.println("after clear operation:"+a);
		
	}

}
