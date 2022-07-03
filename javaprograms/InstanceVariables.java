package javaprograms;

public class InstanceVariables {
public void addition() {
	int a=20;
	int b=30;
	System.out.println(a+b);
}
public void diff() {
	float c=9.5f;
	float d=4.3f;
	System.out.println(c-d);
	
}
	public static void main(String[] args) {
		
InstanceVariables I= new InstanceVariables();
I.addition();
I.diff();
	}

}
