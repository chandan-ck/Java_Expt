import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class abc<X> {

	public static void main(String[] args) {
		
		int a=5;
		int x,y,z;
		x=0;
		y=1;
		x=y=x=8;
		
		System.out.println("---------"+x);
		
		
		//System.out.println(cube (a));
		
		// TODO Auto-generated method stub
/*Map<String , Integer> mm=new HashMap<>();

mm.put("x",new Integer(3));
mm.put("Y",new Integer(4));
mm.put("z",new Integer(5));

mm.remove(new String("x"));

System.out.println(mm);*/
		
		abc<Integer> gn=new abc<>();
		gn.push(36);
		System.out.println(gn.pop());
	}
	
	private int cube(int a) {
		// TODO Auto-generated method stub
		return a*a*a;
	}

	Stack<X> ss=new Stack<X>();
	public void push(X obj1) {
		ss.push(obj1);
	}
	public X pop() {
		X obj1=ss.pop();
		return obj1;
	}
}
