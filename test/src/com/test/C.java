package com.test;

public class C {

	public static void main(String []args) {
		A ob=new A(1,"abx");
		m2(ob);
	}

	private static A m2(A obj) {
		// TODO Auto-generated method stub
		obj.setName("aaa");
		obj=new A(1,"xxxxx");
		System.out.println(obj.getName());
		
		return obj;
	}
}
