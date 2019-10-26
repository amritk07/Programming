package Basic;
import java.util.*;
public class Marray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
   int[][] arr = new int[3][3];
   System.out.println("Enter element");
   for(int i = 0;i<3;i++)
   {
	   for(int j = 0;j<3;j++)
	   {
		   arr[i][j] = input.nextInt();
		   
		   
	   }
    }
   for(int i = 0;i<3;i++)
   {
	   for(int j = 0;j<3;j++)
	   {
		  System.out.print( arr[i][j]);
		   
		  System.out.print(" "); 
	   }
	   System.out.print(" \n");
    }
   
   
   
	}

}
