package collection;

import java.util.*;

public class ArrayList3
{

	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<String>();
		list.add("grapes");
		list.add("banana");
		list.add("carrot");
		list.add("sowjanya");
		list.add("pen");
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
