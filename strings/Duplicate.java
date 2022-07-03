package strings;

public class Duplicate {

	public static void main(String[] args) {
		String str="Garikapti";
		char ch[]=str.toCharArray();
		int length=str.length();
		for(int i=0;i<length;i++) {
			for(int j =i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					
					System.out.println("Duplicate character is:"+ch[j]);
					break;
				}
			}
			
		}

	}

}
