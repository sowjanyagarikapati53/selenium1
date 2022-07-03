package exceptions;

public class Throw {

	public static void main(String[] args) throws UnderAgeException {
		int age =16;
		
		if(age<18) {
			
			throw new UnderAgeException("not eligible to vote");
		}
		
		
	}

}
