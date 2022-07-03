package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString 
{

	public static void main(String[] args) 
	{
		String names[]= {"ravi","anu","adhi","anu","sowji"};

		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++) 
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("duplicates string is :"+names[j]);
				}
			}
		}
		System.out.println("----------");

		//by using hashset
		HashSet<String> h = new HashSet<String>();
		for(String name:names)
		{
			if(h.add(name)==false) 
			{
				System.out.println("duplicate string is:"+name);
			}
		}

		System.out.println("--------");
		//by usig hashmap
		
		HashMap<String, Integer> hm = new HashMap<String ,Integer>();
		for(String name:names)
		{
			Integer count = hm.get(name);
			if(count == null)
			{
				hm.put(name, 1);
			}
			else
			{
				hm.put(name,++count);
			}
		}

		Set<Entry<String, Integer>> entryset = hm.entrySet();
		for(Entry<String, Integer> entry:entryset) 
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicate string is:"+entry.getKey());
			}
		}

	}

}
