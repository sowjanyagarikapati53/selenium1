package javaprograms;

public class MethodOverloading1 {
	public static void sub(float a,float b) {
		System.out.println(a-b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	

	public static void main(String[] args) {
		sub(12.3f,1.2f);
		sub(30,10);
		
	}

}
