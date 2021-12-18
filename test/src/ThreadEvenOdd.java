
public class ThreadEvenOdd {

	public ThreadEvenOdd() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []ar ) {
		Object loc=new Object();
		OddThread oddThread=new OddThread(1,loc);
		EvenThread evenThread=new EvenThread(2,loc);
		Thread t1=new Thread(oddThread);
		Thread t2=new Thread(evenThread);
		t1.start();
		t2.start();
	}
  
}
