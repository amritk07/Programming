package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/*Set<String> h1 = new HashSet<String>();
		h1.add("john");
		h1.add("Wick");
		Set<String> l1 = new LinkedHashSet<String>();
		l1.add("john");
		l1.add("Wick");*/
		SortedSet<String> sortedNames = new  TreeSet<String>();
		NavigableSet<String> n1 = new  TreeSet<String>();
		sortedNames.add("Java");
	    sortedNames.add("SQL");
	    sortedNames.add("HTML");
	    sortedNames.add("CSS");
		/*for(String x : sortedNames)
		{
			System.out.println(x);
		}*/
	    System.out.println("Sorted set");
	    System.out.println(sortedNames);
		SortedSet<String> s1 = sortedNames.headSet("HTML");
		System.out.println(s1);
		SortedSet<String> s2 = sortedNames.tailSet("Java");
		System.out.println(s2);
		SortedSet<String> s3 = sortedNames.subSet("Java", "SQL");
		System.out.println(s3);
		n1.add("b");
		n1.add("a");
		n1.add("d");
		n1.add("c");
		System.out.println("Navigable set");
		
		System.out.println(n1.headSet("d",true));
		System.out.println(n1.tailSet("c",false));
		System.out.println(n1.subSet("b", true,"d",true));
		
	}
	
	

}
