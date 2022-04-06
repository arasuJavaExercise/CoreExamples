package com.designpatterns.structuralpattern.proxy.example2;

public class ProxyDemo {

	public static void main(String[] args) {
		Internet nonBlockSites = new ProxyInternet();
		try {
			nonBlockSites.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			nonBlockSites.connectTo("google.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
