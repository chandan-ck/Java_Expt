package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList=new ArrayList<>();
		Set<Person> personSet=new HashSet<>();
		Person p1=new Person();
		p1.setAge(1);
		p1.setName("ck");
		
		Person p2=new Person();
		p2.setAge(1);
		p2.setName("ck");
		personList.add(p1);
		if(!personList.contains(p2))
			personList.add(p2);
		
		System.out.println(personList);
		personSet.add(p1);
		personSet.add(p2);
		System.out.println(personSet);
	}

}
