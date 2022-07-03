package javaprograms;

public class ArraySum {
	public void sum(int a[]) {
		int n=0;
		for(int i=0;i<a.length;i++) {
			n=n+a[i];
			
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		ArraySum s= new ArraySum();
		int b []= {20,30,40,50,50,40};
		s.sum(b);

	}

}
