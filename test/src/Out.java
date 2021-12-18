
public class Out {

	static void compute(int q) throws Sample{
		throw new Sample(q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	compute(3);
}catch(Exception e) {
	System.out.println("except");
}
	}

}
