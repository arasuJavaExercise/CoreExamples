package com.corepack;

class Person implements Cloneable {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "[NAME : " + name + ", AGE : " + age + "]";
	}
}

public class ObjectCloningDemo {

	public static void main(String[] args) {

		try {
			Person person1 = new Person();
			person1.setName("Arasu");
			person1.setAge(35);

			System.out.println(person1);
			Person person2 = (Person) person1.clone();
			System.out.println(person2);
			
			
			System.out.println(person1.hashCode()+" "+person2.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
