package Basic;
import java.util.Scanner;
/*class Car
{
	void show()
	{
		System.out.println("Hello");
	}
	void show1()
	{
		System.out.println("Hello car");
	}
}
class Bike extends Car
{
	void show()
	{
		System.out.println(" again");
	}
}*/
class Student
{
	Scanner in = new Scanner(System.in);
	String name;
	String roll;

	/*Student(String name, String roll){
	
		this.name=name;
		this.roll=roll;
	}*/
	void getInput()
	{
		Student[] s1;
		s1 = new Student[5];
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter name and rollno: "+(i+1)+"student");
		s1[i].name=in.nextLine();
		System.out.println("Enter Rollno.: ");
		s1[i].roll=in.next();
	}
	
	
	for (int i = 0; i < s1.length; i++) 
        System.out.println("Element at " + i + " : " + 
                    s1[i].roll +" "+ s1[i].name);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Car c1 = new Car();
		//c1 = new Bike();
		//c1.show();
		//c1.show1();
		Student st = new Student();
		st.getInput();
		
	}

}
