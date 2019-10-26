
import java.util.Scanner;
import java.util.*;
public class EXP_9_collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		   List<Integer> li = new ArrayList<Integer>();
		       Scanner in = new Scanner(System.in);
		       
		       li.add(5);
		       li.add(3);
		       li.add(8);
		       li.add(4);
		       li.add(5);
		      
		      ListIterator<Integer> itr = li.listIterator();
		       System.out.println("Before");
		       while(itr.hasNext())
		       {
		    	   System.out.print(itr.next()+" "); 
		       }
		       System.out.println("\nAfter");
		       while(itr.hasPrevious())
		       {
		    	   System.out.print(+itr.previous()+" ");
		       }
		       
		      
		     
		      
		      
			}
             
		

	}


