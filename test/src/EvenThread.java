/**
 * 
 */

/**
 * @author Chamdan
 *
 */
public class EvenThread  implements Runnable{

private int no;
private Object loc;
public EvenThread(int no, Object loc) {
	this.no = no;
	this.loc = loc;
}
@Override
public void run() {
	synchronized (loc) {
	while(no<=10) {
	// TODO Auto-generated method stub
	if(no%2!=0) {
		
			try {
				loc.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	else {
		System.out.println("even "+no);
		no+=2;
		loc.notify();
	}
	
}
	}
}
}
