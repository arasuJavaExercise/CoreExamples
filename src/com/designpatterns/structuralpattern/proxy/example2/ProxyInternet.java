package com.designpatterns.structuralpattern.proxy.example2;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	RealInternet rInternet = new RealInternet();
	List<String> bannedSites = new ArrayList<>();

	public ProxyInternet() {
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("xyz.com");
	}

	@Override
	public void connectTo(String serverHost) throws Exception {
		if (bannedSites.contains(serverHost)) {
			throw new Exception("HOST BLOCKED: This Host is Blocked...");
		} else {
			rInternet.connectTo(serverHost);
		}
	}

}
