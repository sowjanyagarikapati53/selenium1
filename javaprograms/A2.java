package javaprograms;

public class A2 {
	int rollno;
	String name;
	static String college;
	void display() {
		System.out.println(rollno+" "+name+" "+college);	
	}
		
	
	

	public static void main(String[] args) {
		A2 a=new A2();
		a.rollno=1;
		a.name="sowjanya";
		a.college="abc";
	
		A2 b= new A2();
		b.rollno=2;
		b.name="suresh";
		a.display();
		b.display();
		
	}

}
