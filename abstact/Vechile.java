package abstact;

public abstract class Vechile {

	public void NumberofWheels() {
		System.out.println("based on the vechile type");
	}
		 abstract void speed();
	}
 class Bike extends Vechile{
	public void speed() {
		System.out.println("running with a speed of 70kmph ");
	}
}
 class Auto extends Vechile{
	 public void speed() {
		 System.out.println("running with a speed of 50kmph");
	 }
 }
 class Car extends Vechile{
	 public void speed() {
		 System.out.println("running with a speed of 100kmph");
	 }
 }

	

