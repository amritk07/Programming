import java.util.ArrayList;
import  java.util.*;

public class Exp_9_collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {2,4,6,8,10};
        int  b[] = {3,6,9,10};
        HashSet<Integer> h1 = new HashSet<Integer>();
        HashSet<Integer> h2 = new HashSet<Integer>();
        
        for(int x : a)
        {
       	 h1.add(x); 
        }
        for(int x : b)
        {
       	 h2.add(x); 
        }
        System.out.println("h1:"+h1);
        System.out.println("h2:"+h2);
        h1.addAll(h2);
        System.out.println("h1: "+h1);
        h1.removeAll(h2);
        System.out.println("h1: "+h1);
        Integer i = new Integer(10);
        System.out.println("Does set contains i? "+h1.contains(i));
        System.out.println("After adding i");
        h1.add(i);
        System.out.println("Does set contains i? "+h1.contains(i));
	}

}
