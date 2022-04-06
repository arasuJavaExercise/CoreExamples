package com.corepack;


class First{
	void show(){
		
	}
}

class Second extends First{
	public void show(){  // Here you cannot make the overridden method more restrict 
		
	}
}


public class MethodOverriddenDemo {

	public static void main(String[] args) {
		First ff = new Second();
		ff.show();
	}

}
