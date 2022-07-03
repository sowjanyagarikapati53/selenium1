package javaprograms;

public class Array5 {

	public static void main(String[] args) {
		int j =0;
		int a[]= {10,20,30,40,40,50};
		int b[]=new int [a.length];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
			}
		b[j]=a[a.length-1];
		
      for(int i=0;i<b.length;i++) {
    	  System.out.println(b[i]+" ");
      }
		
		
		
	}

}
