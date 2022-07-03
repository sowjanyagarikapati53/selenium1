package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx 
{

	public static void main(String[] args) 
	{
	    String str =  "AAAABBBCCDD";
	    String[] a= str.split("");
	    Map<String, Integer> m = new HashMap<String, Integer>();
	    
	    for(String s :a) 
	    {
	    	if(m.containsKey(s)) {
	    		m.put(s, m.get(s)+1);
	    	}
	    	else 
	    	{
	    		m.put(s, 1);
	    	}
	    }
	    Set<Entry<String, Integer>> entryset = m.entrySet();
		for(Entry<String, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.print(entry.getValue()+""+entry.getKey());
			}
		}
	    
	}

}
