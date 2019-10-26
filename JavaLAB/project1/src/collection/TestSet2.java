package collection;
import java.util.*;
import java.util.NavigableSet;

public class TestSet2 {
	
	public static void main(String args[])
	{
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        ns.add(3); 
        ns.add(4); 
        ns.add(8); 
        ns.add(6);
        System.out.println("lower(6): " + ns.lower(6)); 
        System.out.println("floor(3): " + ns.floor(3)); 
        System.out.println("higher(6): " + ns.higher(6)); 
        System.out.println("ceiling(5): " + ns.ceiling(5)); 
		
	}
	
}