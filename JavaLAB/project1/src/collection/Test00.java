package collection;
import java.util.*;
public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> l1 = new ArrayList<String>();
       l1.add("h");
       l1.add("d");
       for(int i=0;i<l1.size();i++)
       {
    	 if(l1.get(i)=="h1")
    	 {
    		 System.out.println("D");
    	 }
    	 else
    		 System.out.print("not exist");
       }
	}

}
