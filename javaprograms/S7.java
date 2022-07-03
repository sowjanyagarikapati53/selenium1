package javaprograms;

public class S7 {
	public void min(int a[]) {
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(smallest>a[i]) { 
				smallest=a[i];
			}
		}
			
			System.out.println(smallest);
		}
	

	public static void main(String[] args) {
		S7 m = new S7();
		int b[] = {25,50,30,5,10};
		m.min(b);
		
	}

}
