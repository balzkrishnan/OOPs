package com.singleinheritance;

public class Transport extends Vechicles {
	public void van() {
		System.out.println("Ashok leyland");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.van();
		t.bikes();
		t.cars();
	}

}
