package basic;
import java.util.*;
public class Hacker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     try {
     System.out.println("Enter");
     int i = in.nextInt();
     int count =0;
     while(i>0)
     {   count =0;
    	 System.out.println("Enter");
    	 String s = in.next().toLowerCase();
    	 char[] c = s.toCharArray();
    	 for(int j =0;j<c.length;j++)
    	 {
    		 char c2 = c[j];
    		 if(c2==97||c2==101||c2==105||c2==111||c2==117)
             {
                 count++;
             }
    	 }
    	 i--;
    	 System.out.println(count);
    	 
     }
     }
     catch (Exception e) {
		// TODO: handle exception
    	 System.out.println(e);
	}
	}
	

}
