package com.streamexample;

import java.util.Arrays;
import java.util.*;
import java.util.OptionalInt;

public class Example17 {
	public static void main(String[] args) {

		int[] intArr = {12,3,11,65,23,78};
		
		OptionalInt opt = Arrays.stream(intArr).max();
		if(opt.isPresent()){
			System.out.println(opt.getAsInt());
		}
		
		List<Person> listPer = Person.loadRecords();
		Optional<Person> option = listPer.stream().filter(t->t.getGender().equals(Gender.MALE)).max((t1,t2)->t1.getAge() - t2.getAge());
		if(option.isPresent()){
			Person person = option.get();
			System.out.println(person);
		}
	}
}
