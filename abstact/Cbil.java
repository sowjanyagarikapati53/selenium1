package abstact;

public abstract class Cbil {
	public void EligibilityCriteria() {
		System.out.println("check customer eligibility");
	}
	 abstract void rateofintrest();

}
 class Hdfc extends Cbil{
	public void rateofintrest() 
	{
		 System.out.println("the rate of intrest for hdfc bank is : 10%");
	 }
    
}
 class Sbi extends Cbil{
	 public void rateofintrest() {
		 System.out.println("the rate of intrest for sbi bank is :8%");
	 }
 }
 class Icici extends Cbil{
	 public void rateofintrest() {
		 System.out.println("the rate of intrest for icici bank is :6%");
	 }
 }

	


