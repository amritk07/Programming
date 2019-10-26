import java.util.*;
class Student {
	String name[]=  new String[10];
	String roll[]=  new String[10];
	Scanner input = new Scanner(System.in);
	
	void getInput()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter name"+" " +(i+1) + " student");
			name[i] = input.next();
			System.out.println("ROllno. :");
		    roll[i] = input.next();
		}
	}
	
	void display()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("NAME: "+name[i]+" Roll No. "+roll[i]);
			
		}
	}
}
public class Exp_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student();
     s1.getInput();
     try
     {
    	 s1.display();
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println(e);
     
	}

}
}