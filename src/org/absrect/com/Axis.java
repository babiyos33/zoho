package org.absrect.com;

public class Axis extends Bank {
	@Override
	public void savings() {
		System.out.println(" 5%");
			
	} 
    @Override
    public void loan() {
    	System.out.println("6 %");
    	
    }
    public static void main(String[] args) {
    	Axis a = new Axis();
    	a.fixed();
		a.loan();
		a.savings();
	}
	
	
	

}
