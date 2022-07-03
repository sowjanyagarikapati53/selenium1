package practice;

public class LetterOccurance
{

	public static void main(String[] args)
	{
		String str = "this is sowjanya";
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//2nd occurence of 's'
		System.out.println(str.indexOf(('s'), str.indexOf('s') + str.indexOf('s')+1));//3rd occurrence of 's'
		
	}

}
