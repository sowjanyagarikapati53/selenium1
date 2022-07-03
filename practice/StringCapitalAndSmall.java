package practice;

public class StringCapitalAndSmall 
{

	public static void main(String[] args)
	{
		int upper =0,lower =0;
		String str = "SowJaNya";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z') 
			{
				upper++;
			}
			else if(ch>='a'&&ch<='z') 
			{
				lower++;
			}
		}
		System.out.println("upper case letters are :"+upper);
		System.out.println("lower case letters are :"+lower);

	}

}
