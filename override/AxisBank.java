package org.override;

public class AxisBank extends Bankinfo {

	public void deposite(int amount) {
		System.out.println(amount);

	}

	public static void main(String[] args) {
		Bankinfo a = new AxisBank();
		a.deposite(2500);
//		a.fixed();
//		System.out.println(a.savings());   
		System.out.println(a.fixed());
		
	
		AxisBank b = new AxisBank();
		b.deposite(2000);
		b.savings();
		System.out.println(b.savings());
		
		
	}
	

	
	
}