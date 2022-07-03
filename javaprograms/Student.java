package javaprograms;

public class Student {
	

	public  Student(String name,int no) {
		System.out.println(name+" "+no);
	}
	public Student() {
		System.out.println("abc");
	}

	public static void main(String[] args) {
		

		Student s2 =new Student("Amar",1);
		Student s3 =new Student();
		
		
	}

}
