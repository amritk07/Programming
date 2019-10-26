package bingo;

import java.util.*;


public class StringSort implements Comparable<StringSort>
{
    
	
	String name;
	
	StringSort(String name)
	{
		
		this.name = name;

		
	}
	public static boolean check(char[] s1, char[] s2)
	{
		boolean b1 = true;
		for(int i =0;i<s1.length;i++)
		{
			for(int j =0;j<s1.length;j++)
			{
				if(s1[i]==s2[j])
				{
					b1 = true;
					
				}
				else {b1 = false; }
		    }
		
		
	    }
		return b1;
}
	@Override
	public int compareTo(StringSort o) {
		
		// TODO Auto-generated method stub
		
         return o.name.compareTo(name);  
		
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in = new Scanner(System.in);
         
          
          List<String> l1 = new ArrayList<String>();
          System.out.println("Enter");
          int n = in.nextInt();
          
          System.out.println("Enter");
          for(int i =0;i<n;i++)
          {
        	  l1.add(in.next());
        	  
          }
          Collections.sort(l1);
          
          
          System.out.println(l1);
          
	}

}
