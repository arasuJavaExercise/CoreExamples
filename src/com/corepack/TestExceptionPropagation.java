package com.corepack;

class MyException extends Exception {

	private static final long serialVersionUID = 878489047742409858L;

	MyException(String str) {
		super(str);
	}

}

public class TestExceptionPropagation {
	void m() throws MyException {
		// throw new java.io.IOException("device error");// checked exception
	}

	void n() throws MyException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}
}
