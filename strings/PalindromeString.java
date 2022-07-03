package strings;

public class PalindromeString {

	public static void main(String[] args) {
		String s="man";
		String str=s;
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("given string is a palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}

}
