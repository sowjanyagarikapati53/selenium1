package exceptions;

public class Throw1 {

	public static void main(String[] args) throws Exception {
		int age=70;
		if( age>60) {
			throw new TooYoungException("please wait some time we will get best match");
		}
		else if(age<18) {
			throw new TooOldException("your age already crossed mrg ");
		}
		else {
			System.out.println("thanks for registation");
		}
	}

}
