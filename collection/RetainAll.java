package collection;

import java.util.*;

public class RetainAll
{

	public static void main(String[] args) 
	{
		ArrayList<Float> a= new ArrayList<Float>();
		a.add(10.5f);
		a.add(12.34f);
		ArrayList<Float> a1=new ArrayList<Float>();
		a1.add(9.5f);
		a1.add(10.5f);
		a.retainAll(a1);
		System.out.println(" iterating the elements after retaining the elements of al2");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
