package strings;

public class Intern {

	public static void main(String[] args) {
		String s="sowjanya";
		String s1=s.intern();
		String s2=new String("sowjanya");
		String s3=s2.intern();
		System.out.println(s1==s2);
		System.out.println(s==s1);
		System.out.println(s==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}

}
