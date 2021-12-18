package test;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample {
   public static void main(String args[]) {
      Set<Integer> treeSet = new TreeSet<Integer>();
      treeSet.add(null);
     // treeSet.add(null);
      //treeSet.add(null);
      //Populating the HashSet
      treeSet.add(1124);
      treeSet.add(3654);
      treeSet.add(7854);
      treeSet.add(9945);
      System.out.println(treeSet);
      //Adding null elements
      
      System.out.println(treeSet);
   }
}