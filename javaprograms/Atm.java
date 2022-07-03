package javaprograms;

public class Atm {

	public static void main(String[] args) {
		boolean card=true;
		String password="sowjanya";
		int withdraw =3000;
		int deposit=2000;
		if(card) {
			System.out.println("please enter valid password");
			if (password=="sowjanya") {
				System.out.println("please enter amount");
				if(withdraw<=deposit) {
					System.out.println("please collect cash");
					
				}
				else {
					System.out.println("insufficient balance");
				}
					
				}
				
			}
		else {
			System.out.println("password is incorrect");
		}
		}
	}


