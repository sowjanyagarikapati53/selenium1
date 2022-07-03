package javaprograms;

public class Array3 {
	public void SecondLargest(int a[]) {
		int largest = 0;
		
		int secondlargest =0;
		
		for (int i =0; i<a.length;i++) {
			
			if(a[i]>largest) {
				
				secondlargest = largest;
				
				largest = a[i];
			}
		}
		
		System.out.println(secondlargest);
	
	}
	

	public static void main(String[] args) {
	 Array3 a3 =new Array3();
	 int b[]= {10,30,40,25,50};
	 a3.SecondLargest(b);
		
	}

}
