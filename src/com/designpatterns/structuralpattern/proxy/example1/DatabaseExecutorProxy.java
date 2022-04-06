package com.designpatterns.structuralpattern.proxy.example1;

public class DatabaseExecutorProxy implements DatabaseExecutor {

	boolean ifAdmin = false;
	ExecuteQueryImpl executeQueryImpl = null;

	public DatabaseExecutorProxy(String name, String password) {
		if (name.equals("Admin") && password.equals("Admin@123")) {
			ifAdmin = true;
		}
		executeQueryImpl = new ExecuteQueryImpl();
	}

	@Override
	public void executeQuery(String operation) throws Exception {

		if (ifAdmin) {
			executeQueryImpl.executeQuery(operation);
		} else {
			if (operation.equals("DELETE"))
				throw new Exception(
						"NOT AUTHORIZED TO DELETE: you are not authorixed to access delete operation");
			else
				executeQueryImpl.executeQuery(operation);
		}

	}

}
