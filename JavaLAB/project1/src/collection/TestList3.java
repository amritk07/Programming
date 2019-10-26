package collection;

import java.util.ArrayList;

public class TestList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] s1 = {"ram", "a", "a", "a", "b","c"};
    String[] s2 = {"ram","a"};
    ArrayList<String> l1 = new ArrayList<String>();
    ArrayList<String> l2 = new ArrayList<String>();
    for(String x : s1)
    {
    	l1.add(x);
    }
    for(String x : s2)
    {
    	l2.add(x);
    }
    l1.retainAll(l2);
    for(String x : l1)
    {
    	System.out.println(x);
    }
   // l1.removeAll(l2);
    for(String x : l1)
    {
    	System.out.println(x);
    }
    
	}

}
