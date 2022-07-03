package strings;

public class CharArray {

	public static void main(String[] args) {
		String s="sowjanyaisverygoodgirl";
		char[]ch = s.toCharArray();
		int length=ch.length;
		System.out.println("char array length:"+length);
		System.out.println("char array elements:");
		for (int i=0;i<length;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
