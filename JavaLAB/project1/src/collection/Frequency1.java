package collection;
import java.util.*;
//insert two paragraph, find the common word and frequency of each word in both paragraph
import java.util.Scanner;
class Count
{
	
     void countFrequency(ArrayList l)
     {
        HashSet<String> h1 = new HashSet<String>();
        h1.addAll(l);
        int count =0;
        Iterator<String> itr = h1.iterator();
           while(itr.hasNext())
          {
  	          count =0;
  	           String s2 = itr.next();
  	             for(int j =0;j<l.size();j++)
  	              {
  		              if(l.get(j).equals(s2))//if(l1.get(j).equals(itr.next())
  		                {
  		                    count++; 
  		                }
  	               }
  	       System.out.println(s2+" "+count);//System.out.println(itr.next() + " "+count);
          }

	 }
}
public class Frequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
      System.out.println("Enter first paragraph");
      String s = in.nextLine().toLowerCase();
      System.out.println("Enter Second paragraph");
      String st = in.nextLine().toLowerCase();
   
      ArrayList<String> l1 = new ArrayList<String>(Arrays.asList(s.split(" ")));
      ArrayList<String> l2 = new ArrayList<String>(Arrays.asList(st.split(" ")));
  
      Count c1 = new Count();
      System.out.println("Frequency of words in first paragraph");
      c1.countFrequency(l1);
      System.out.println("Frequency of words in Second paragraph");
      c1.countFrequency(l2);
 
 
 
 l1.retainAll(l2);
      HashSet<String> str = new HashSet<String>();
      if(l1.isEmpty())
      {
    	  System.out.println("No common words");
      }
      else 
      {
      for(String x : l1)
      {
    	  str.add(x);
      }
      System.out.println("Common words in both paragraph: "+ str);
    
      
      
	}

}}
