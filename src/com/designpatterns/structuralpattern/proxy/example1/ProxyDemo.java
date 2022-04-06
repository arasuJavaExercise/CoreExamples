package com.designpatterns.structuralpattern.proxy.example1;

public class ProxyDemo {
	public static void main(String[] args) {
		
		DatabaseExecutor nonAdmin = new DatabaseExecutorProxy("Rajesh", "Admin123$");
		try {
			nonAdmin.executeQuery("DELETE");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		DatabaseExecutor admin = new DatabaseExecutorProxy("Admin", "Admin@123");
		try {
			admin.executeQuery("DELETE");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
