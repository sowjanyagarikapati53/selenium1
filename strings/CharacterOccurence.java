package strings;

public class CharacterOccurence {

	public static void main(String[] args) {
		String s="sowjanya garikapati";
		int totalcount=s.length();
		int totalcount_afterRemove=s.replace("a", "").length();
		int count=totalcount-totalcount_afterRemove;
		System.out.println("number of occurence of a is:"+count);
		
	}

}
