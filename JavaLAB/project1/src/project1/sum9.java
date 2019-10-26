package project1;
import java.util.Scanner;
public class sum9 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int j=0;
	  int[] a = new int[5];
	  
	  System.out.print("Enter");
	  for(int i=0;i<a.length;i++)
	  {
		a[i] = input.nextInt();  
		if(a[i]%2==0)
		{
	    j++;
		}
       }
	  int b[] = new int[j];
	  j =0;
	  for(int i=0;i<a.length;i++)
	  {
		if(a[i]%2==0)
		{
	    b[j] = a[i];
	    j++;
		}
       }
	  for(j=0;j<b.length;j++) {
	  System.out.println(b[j]);
	  
}
}
}