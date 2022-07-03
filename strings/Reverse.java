package strings;

public class Reverse {

	public static void main(String[] args) {
		String s="this is sowjanya";
		int len=s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse of the given string is: "+rev);
	}

}
