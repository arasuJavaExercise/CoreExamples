package com.designpatterns.structuralpattern.proxy.example1;

public class ExecuteQueryImpl implements DatabaseExecutor {

	@Override
	public void executeQuery(String opertaion) throws Exception {
		System.out.println("Executing " + opertaion + "!");
	}

}
