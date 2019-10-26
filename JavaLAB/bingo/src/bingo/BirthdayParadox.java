package bingo;
import java.util.*;
public class BirthdayParadox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in = new Scanner(System.in);
         System.out.println("Enter");
		 float p = in.nextFloat();
		 int num = 365;
		 int den = 365;
		 int count=0;
		 float n = 1;
		 float y = 1-n;
		 while(p>=y)
		 {
			 n = n*(num)/den;
			 y = 1-n;
			 num--;
			 count++;
			 
		 }
		 System.out.println(count);
	}

}
