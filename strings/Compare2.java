package strings;

public class Compare2 {

	public static void main(String[] args) {
		String s1="suresh";
		String s2="suresh";
		String s3= new String ("suresh");
		System.out.println(s1==s2);
		System.out.println(s1==s3);;//false(because s3 refers to instance created in nonpool)
	}

}
