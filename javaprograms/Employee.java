package javaprograms;

public class Employee {
	
		int id;
		String ename;
		void display() {
		
		System.out.println(id+" "+ename);
		}
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2= new Employee();
		e1.display();
		e2.display();
		
	}

}
