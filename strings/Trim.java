package strings;

public class Trim {

	public static void main(String[] args) {
		String s="  get well soon  ";
		System.out.println(s.length());
		System.out.println(s);//without trim
		String tr=s.trim();
		System.out.println(tr.length());
		System.out.println(tr);//with trim
	}

}
