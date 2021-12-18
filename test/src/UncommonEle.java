import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
	    Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));
	    HashSet<Integer> result=symmetricDifference(a,b);
	    System.out.println(result);
	}
	private static HashSet<Integer> symmetricDifference(Set<Integer> a, Set<Integer> b) {
		HashSet<Integer> result = new HashSet<Integer>(a);
	    for (Integer element : b) {
	        // .add() returns false if element already exists
	        if (!result.add(element)) {
	            result.remove(element);
	        }
	    }
	    return result;
	}
}
