package com.hierarichal;

public class HDFCBank extends RBI{
	public void hDFC() {
		System.out.println("HDFC BANK");
	}
	public static void main(String[] args) {
		HDFCBank H = new HDFCBank();
		H.hDFC();
		H.parentBank();
	}

}
