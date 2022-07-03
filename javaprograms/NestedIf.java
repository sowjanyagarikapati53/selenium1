package javaprograms;

public class NestedIf {

	public static void main(String[] args) {
		int age =20;
		int weight=30;
		if(age>=18) {
			if(weight>50) {
				System.out.println("you are eligible to donate blood");
				
			}
			else {
				System.out.println("weight not match");
			}
			
			
		}else {
			System.out.println("you are not eligible to donate blood");
		}
	}

}
