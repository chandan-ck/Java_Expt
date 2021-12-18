package com.test.lowes;

public class AAA implements Runnable{
	
/*	private static int x;
	public synchronized void doThings() {
		int current=x;
		current++;
		x=current;
	}*/
	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		Thread t=new Thread(new AAA());
		t.run();
		t.run();
		t.start();
	}
}
