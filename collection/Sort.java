package collection;

import java.util.*;

public class Sort
{

	public static void main(String[] args)
	{
		System.out.println("sorted numbers are.....");
		List<Integer> i= new  ArrayList<Integer>();
		i.add(50);
		i.add(75);
		i.add(60);
		i.add(10);
		i.add(15);
		Collections.sort(i);
		for(Integer number:i)
			System.out.println(number);
	}

}
