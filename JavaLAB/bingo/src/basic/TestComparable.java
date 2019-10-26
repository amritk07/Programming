package basic;
import java.lang.*;
import java.util.*;


class Student implements Comparable<Student>
{

	int age;
	String name;
	int year;
	Student(int age,String name,int year)
	{
		this.age = age;
		this.name = name;
		this.year = year;
		
	}
	@Override
	public int compareTo(Student o) {
		
		// TODO Auto-generated method stub
		//return o.age - age; decreasing order
		//return age- o.age;
		//return name.compareTo(o.name);
		return o.name.compareTo(name);
	}
	
	
	
}









public class TestComparable {

	
	
	public static void main(String args[]) {
		ArrayList<Student> s1 = new  ArrayList<Student>();
		s1.add( new Student(11,"amrit",1999));
		s1.add( new Student(21,"nmrit",2999));
		s1.add( new Student(12,"kmrit",1929));
		s1.add( new Student(81,"alrit",2999));
		s1.add( new Student(61,"zmrit",4999));
		Collections.sort(s1);
	     for(Student x : s1)
	     {
	    	 System.out.println(x.age+" "+x.name+" "+x.year);
	     }
		
	}
	

}
