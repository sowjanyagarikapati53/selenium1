package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString 
{

	public static void main(String[] args) 
	{
	  FindDuplicateWords("Hey java is  java best language is java");

	}
	
	public static void FindDuplicateWords(String inputString) 
	{
		//split
	  String words[]= inputString.split(" ");
	  
	  //create hash map
	  Map<String, Integer> m = new HashMap<String,Integer>();
	  
	  //to check each word in given array
	  for(String word:words) 
	  {
		  //if word is present
		  if(m.containsKey(word)) {
			  m.put(word.toLowerCase(),m.get(word)+1);
		  }
		  else {
			  m.put(word, 1);
		  }
	  }
		  //extracting all the keys of the map
		  Set<String> s = m.keySet();
		   for(String word:s) {
			  if(m.get(word)>1) {
				  System.out.println(word+ ":"+m.get(word));
			  }
		   }
	  }
	}


