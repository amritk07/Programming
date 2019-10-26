package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in = new Scanner(System.in);
   System.out.println("Enter a paragraph");
   String s = in.nextLine();
   String[] s1 = s.split(" ");
  ArrayList<String> list = new ArrayList<String>();
  ArrayList<String> li  = new ArrayList<String>();
  Iterator<String> itr = list.iterator();
  for(int i =0; i<s1.length;i++)
  {
	  list.add(s1[i]);
  }  int K = 0;
	 int count;
	 for(int i = 0 ;i <list.size();i++)
	 {
		 count = 0;
		 
		 
			 for(int j = 0;j<list.size();i++)
			 {
				 if(list.get(i).contains(list.get(j)))
				 {
					 count++;
				 }
			 }
			 System.out.print(list.get(i)+" "+count);
			 li.add(list.get(i));
			 list.removeAll(li);
		 
		 
     }  
}}
