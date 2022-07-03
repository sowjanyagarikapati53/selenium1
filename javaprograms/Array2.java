package javaprograms;

public class Array2 {
	public void max(int a[]) {
		int largest=0;
		for(int i=0;i<a.length;i++) 
			if(largest<a[i]) 
				largest=a[i];
			
				System.out.println(largest);
			
		}
	

	public static void main(String[] args) {
		Array2 A2=new Array2();
		int b[]= {10,20,14,5,22};
		A2.max(b);
	
		
		
	}

}

