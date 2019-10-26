package map;
import java.util.*;
public class TestMap0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer, Integer> test = new HashMap<Integer, Integer>();
     test.put(1,5);
     test.put(2,6);
     test.put(4,6);
     test.put(7,8);
     test.put(3, 6);
     test.put(2,9);//replace 6 with 9
     System.out.println(test.put(1,6));//return previous value associated with the key
     System.out.println(test.get(2));
     System.out.println(test.isEmpty());
     System.out.println(test.containsValue(9));
     System.out.println(test.containsKey(9));
     System.out.println(test.size());
     System.out.println(test.remove(2));//test.put(2,9)
     Set s1 = test.entrySet();
     Iterator i1 = s1.iterator();
     while(i1.hasNext())
     {
    	 Map.Entry e1 = (Map.Entry)i1.next();
    	 System.out.println(e1.getKey()+" "+e1.getValue());
    	 
     }
	}

}
