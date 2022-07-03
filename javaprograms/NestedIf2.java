package javaprograms;

public class NestedIf2 {

	public static void main(String[] args) {
		boolean card = true;
		int deposit = 5000;
		int withdraw = 4000;
		String password="sowjanya";
		
		if (card) {
			System.out.println("please enter your password");
		
		if(password=="sowjanya") {
			System.out.println("please enter the amount");
			if(withdraw<=deposit) {
				System.out.println("please collect your cash");
				
				}
			else {
				System.out.println("insufficiant balance");
			}
			
		}
		
		else {
			System.out.println("password is incorrect");
		}
		}
		
		else {
			System.out.println("please enter valid card");
		}
			
				
				
			}
		}

	


