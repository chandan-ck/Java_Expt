import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class AAA {
	int xx=5;
	
	
	static int x=10;
	
	/*public  Tester() {
		System.out.println(this.x);
		AAA();
	}
	public static void sample() {
		System.out.println(this.x);
	}*/
	public static void main(char[] args) {
		System.out.println("hhh");
	}
	
	public static void main(String[] args) {
		AAA bb=new AAA();
		
		bb.dostt();
		double a=295.04;
		int b=300;
		byte c=(byte)a;
		byte d=(byte)b;
		System.out.println(c+"hhh-----"+d);
		//new sample();
		
		Set<Integer> hhh=new HashSet<>();
		hhh.add(1);
		hhh.add(null);
		System.out.println(hhh);
		
		// TODO Auto-generated method stub
		BitSet o=new BitSet(5);
		for(int i=0;i<5;i++) {
			o.set(i);
		}
		o.clear(2);
		
		System.out.println(o);
		
		//AAA a=new AAA( );
		AAA a1=new AAA( );
		
		//a.x +=1;
		//System.out.println(a.x + a1.x);
		
		
		try {
			return;
		}finally {
			//System.out.println(a.x + a1.x);
		}
	}

	private void dostt() {
		System.out.println("do stuff");
		// TODO Auto-generated method stub
		if(xx<10) {
			try {
				wait();
			}catch(Exception e) {
				
			}
		}else {
			System.out.println("xx---"+xx++);
			if(x>=10) {
				notify();
			}
		}
	}

}
