package abstact;

public class Abstact {

	public static void main(String[] args) {
		Bike b=new Bike() ;
		b.NumberofWheels();
		b.speed();
		Auto a=new Auto();
		a.NumberofWheels();
		a.speed();
		Car c=new Car();
		c.NumberofWheels();
		c.speed();
		
	}

}
