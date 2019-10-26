import java.util.*;

public class Exp9_collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map map=new HashMap();  
	    
	    map.put(1,"Amrit");  
	    map.put(3,"Ankit");  
	    map.put(2,"Akshit");  
	    map.put(8,"Aman");  
	    System.out.println("ContainKey 9? "+ map.containsKey(9));
	    System.out.println("ContainVAlue Amrit? "+ map.containsValue("Amrit"));
	    Set set=map.entrySet();
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  
	 
		
	}


