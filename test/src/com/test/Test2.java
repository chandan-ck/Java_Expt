package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	Testclass1 tt=new Testclass1();
	public static void main(String[] args) {
		int []a= {1,2,3};
		Person p1=new Person();
		p1.setAge(20);;
		p1.setName("ck");
		
		List<Integer> arr=new ArrayList<>();
		arr.add(15);
		arr.add(14);
		
		change(a,p1,arr);
		for(int k: a)
		System.out.println(k);
		System.out.println("age- "+p1.getAge());
		System.out.println("arr- "+arr);
	}
	private static void change(int[] a, Person p1, List<Integer> arr) {
		// TODO Auto-generated method stub
		a[1]=5;
		p1.setAge(1);
		arr.set(1, 50);
	}

}
