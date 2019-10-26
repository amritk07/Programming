package collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*ArrayList*/Collection<Integer> li = new ArrayList<Integer>();
       Scanner in = new Scanner(System.in);
       System.out.println("Add element");
       for(int i = 0;i<10;i++)
       {
    	/* boolean b=*/  li.add(in.nextInt()); 
    	// System.out.println(b);
       }
       System.out.println("Before");
       for(Integer x :li)
       {
    	   System.out.println(x);
       }
       Iterator<Integer> itr = li.iterator();
       
       while(itr.hasNext())
       {
    	   int v = itr.next();
    	   if(v<3 || v>10)
    	   {
    		   itr.remove();
    	   }
       }
       System.out.println("After");
       for(Integer x :li)
       {
    	   System.out.println(x);
       }
	}

}
