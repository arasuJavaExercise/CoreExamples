package com.java8;

interface MessageIntf {
	Message getMessage(String msg);
}

class Message {
	public Message(String msg) {
		System.out.println(msg);
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		MessageIntf intf = Message::new;
		intf.getMessage("Hi Good Morning!!!");
	}

}
