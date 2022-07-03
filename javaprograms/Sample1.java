package javaprograms;

public class Sample1 {

	public static void main(String[] args) {
		int sanskrit = 98;
		int english = 80;
		int hindi = 72;
		int maths = 95;
		int science = 85;
		int social = 76;
		 int total =(sanskrit+english+hindi+maths+science+social);
				 
		float marks =(total*100)/600;
		System.out.println(total);
		System.out.println(marks);
		if(marks>80&&marks<100) {
			System.out.println("a grade");
		}
		else if (marks>70&& marks<80)
		{
			System.out.println("b grade");
		}
		else if (marks>60&&marks<70) {
			System.out.println("c grade");
		}
		else if(marks>50&& marks<60) {
			System.out.println("d grade");
		}
			else if (marks<50) {
				System.out.println("failed");
			}
		}
	}


