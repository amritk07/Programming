package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Enter  paragraph");
       String s = in.nextLine().toLowerCase();
       String[] s1 = s.split(" ");
       ArrayList<String> l1 = new ArrayList<String>();
       HashSet<String> h1 = new HashSet<String>();
      
       for(String x : s1)
       {
     	  l1.add(x);
       }
       h1.addAll(l1);
       
      
       int count =0;
       Iterator<String> itr = h1.iterator();
       
       while(itr.hasNext())
       {
    	   count =0;
    	   String s2 = itr.next();
    	   for(int j =0;j<l1.size();j++)
    	   {
    		   if(l1.get(j).equals(s2))//if(l1.get(j).equals(itr.next())
    		   {
    		   count++; 
    		   }
    	   }
    	   System.out.println(s2+" "+count);//System.out.println(itr.next() + " "+count);
       }
       

}}
