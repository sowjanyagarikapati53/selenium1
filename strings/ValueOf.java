package strings;

public class ValueOf {

	public static void main(String[] args) {
		boolean b=true;
		int i=15;
		float f=10.5f;
		double d=10.32d;
		char ch[]= {'j','a','v','a'};
		String s1=String.valueOf(b);
		String s2=String .valueOf(ch);
		String s3=String .valueOf(d);
		String s4=String.valueOf(f);
		String s5=String.valueOf(i);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		

	}

}
