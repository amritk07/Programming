package collection;
import java.util.*;
class Emp3 implements Comparator<Emp3>
{
  double sal;
  String name;
  String dep;
  int age;
	Emp3(String name,int  age, double sal, String dep)
	{
		this.name = name;
		this.age = age;
		this.sal = sal;
	    this.dep = dep;
	    
	    
	}
	public Emp3() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Emp3 arg0, Emp3 arg1) {
		// TODO Auto-generated method stub
		return arg0.age - arg1.age;
	}
}
class Dep implements Comparator<Emp3>
{

	@Override
	public int compare(Emp3 arg0, Emp3 arg1) {
		// TODO Auto-generated method stub
		return arg0.dep.compareTo(arg1.dep);
	}

	
	
}
public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 ArrayList<Emp3> li = new ArrayList<Emp3>();
		 for(int i=0;i<5;i++)
	       {
	    	   System.out.println("Enter name, age,sal of  employee");
	    	   String s1 = in.next();
	    	   int s2 = in.nextInt();
	    	   double s3 = in.nextDouble();
	    	   System.out.println("Enter 1 for IT dep, 2 for ACCOUNT dep, 3 for Security dep ");
	    	   int j = in.nextInt();
	    	   String s4 = null;
	    	   switch (j) 
	   	    {
	   	    case 1:
	   	    	s4 = "IT";
	   	    	break;
	   	    case 2:
	   	    	s4 = "ACCOUNT";
	   	    	break;
	   	    case 3:
	   	    	s4 = "SECURITY";
	   	    	break;
	   	    }
	    	   li.add(new Emp3(s1,s2,s3,s4));
	    	   
	       }
	       Collections.sort(li, new Emp3());
	       System.out.println("\n Sorted by Age");
	       for(Emp3 x : li)
	       {
	    	   System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
	       }
	       Collections.sort(li, new Dep());
	       System.out.println("\n Sorted by Department");
	       for(Emp3 x : li)
	       {
	    	   System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
	       }
	      
	}

}
m knm