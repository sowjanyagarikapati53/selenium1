package interfaces;

	

class Mi implements Print,Showable {
	public void draw() {
		System.out.println("hello");
	}
		public void show() {
			System.out.println("good night");
		}
	
	

	public static void main(String[] args) {
		Mi i=new Mi();
		i.draw();
		i.show();
	}

}
