package collection;

import java.util.*;

public class ArrayGetSet 
{

	public static void main(String[] args)
	{
		ArrayList <String> a=new ArrayList<String>();
		a.add("sowjanya");
		a.add("mango");
		a.add("apple");
		a.add("namme");
		System.out.println("returning element:"+a.get(2));
		a.set(2, "grapes");
		for(String s:a)
			System.out.println(s);

	}

}
