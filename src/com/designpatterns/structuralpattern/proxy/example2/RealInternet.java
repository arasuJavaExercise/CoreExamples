package com.designpatterns.structuralpattern.proxy.example2;

public class RealInternet implements Internet {
	@Override
	public void connectTo(String serverHost) throws Exception {
		System.out.println("Connecting to.. " + serverHost);
	}
}
