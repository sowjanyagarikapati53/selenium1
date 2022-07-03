package abstact;

import javax.swing.text.html.HTMLFrameHyperlinkEvent;

public class Customer {

	public static void main(String[] args) {
		Hdfc H=new Hdfc();
		H.EligibilityCriteria();
		H.rateofintrest();
		Sbi s=new Sbi();
		s.EligibilityCriteria();
		s.rateofintrest();
		Icici i=new Icici();
		i.EligibilityCriteria();
		i.rateofintrest();
	}

}
