package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
     int roll;
     String name;
     double cgpa;
     Student(int roll, String name, double cgpa)
     {
    	 this.roll = roll;
    	 this.name = name;
    	 this.cgpa = cgpa;
     }
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		//return this.roll-arg0.roll;
		return this.name.compareTo(arg0.name); 
	}
	
}
public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Student> l = new ArrayList<Student>();
      l.add(new Student(4,"abc",7.6));
      l.add(new Student(3,"xyz",7.9));
      l.add(new Student(1,"pqr",9.6));
      l.add(new Student(2,"lmn",10.0));
	
	System.out.println("Before Sorting");
	for(Student s : l)
	{
		System.out.println(s.roll+" "+s.name+" "+s.cgpa);
	}
     Collections.sort(l);
     System.out.println("After Sorting");
 	for(Student s : l)
 	{
 		System.out.println(s.roll+" "+s.name+" "+s.cgpa);
 	}
}}
