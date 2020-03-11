package com.hierarichal;

public class ICICIBank extends RBI {
	public void ICICI() {
		System.out.println("ICICI Bank");
	}
	public static void main(String[] args) {
		ICICIBank I = new ICICIBank();
		I.ICICI();
		I.parentBank();
		
	}

}
