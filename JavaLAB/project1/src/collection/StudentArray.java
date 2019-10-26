package collection;
import java.util.Scanner;
//Java program to illustrate creating an array of 
//objects 

class Student1
{
   String name;
   int roll;
   Student1(String n, int r)
   {
	   name = n;
	   roll = r;
   }
}



public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 arr[] = new Student1[3];
		Scanner in = new Scanner(System.in);
		// arr[0] = new  Student1("aaa",2);
		// arr[1] = new Student1("xyz",3);
		// arr[2] = new Student1("pqr",4);
		for(int i =0 ;i <3;i++)
		{
			System.out.println("Enter name and RollNO.");
			
			String s1 = in.next();
			int j = in.nextInt();
		    
			arr[i]= new Student1(s1,j);
		}
		for(int i =0;i<3;i++)
		{
			System.out.println(arr[i].name+" "+arr[i].roll);
		}
		
		
	}

}
