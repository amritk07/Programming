package collection;
import java.util.*;

class Emp implements Comparable<Emp>
{
  double sal;
  String name;
  String dep;
  int age;
	Emp(String name,int  age, double sal, String dep)
	{
		this.name = name;
		this.age = age;
		this.sal = sal;
	    this.dep = dep;
	    
	    
	}
	@Override
	public int compareTo(Emp arg0) {
		// TODO Auto-generated method stub
		return this.age-arg0.age;
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
       ArrayList<Emp> li = new ArrayList<Emp>();
       ArrayList<Emp> l1 = new ArrayList<Emp>();
       ArrayList<Emp> l2 = new ArrayList<Emp>();
       ArrayList<Emp> l3 = new ArrayList<Emp>();
       for(int i=0;i<8;i++)
       {
    	   System.out.println("Enter name, age,sal of  employee");
    	   String s1 = in.next();
    	   int s2 = in.nextInt();
    	   double s3 = in.nextDouble();
    	   System.out.println("Enter 1 for IT dep, 2 for ACCOUNT dep, 3 for Security dep ");
    	   int j = in.nextInt();
    	   String s4 = null;;
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
    	   li.add(new Emp(s1,s2,s3,s4));
    	   
       }
       
        for(Emp x: li)
       {
    	  if(x.dep=="IT")
    	  {
    	 l1.add(new Emp(x.name,x.age,x.sal,x.dep)) ;
    	  }
    	  if(x.dep=="ACCOUNT")
    	  {
    	 l2.add(new Emp(x.name,x.age,x.sal,x.dep)) ;
    	  }
    	  if(x.dep=="SECURITY")
    	  {
    	 l3.add(new Emp(x.name,x.age,x.sal,x.dep)) ;
    	  }
       }
       Collections.sort(l1);
       System.out.println("Employee of IT department");
       for(Emp x: l1)
		{
			System.out.println("Name: "+ x.name+" "+"Age: "+ x.age+" "+"Sal: "+ x.sal);
			
		}
       System.out.println("\n");
       Collections.sort(l2);
       System.out.println("Employee of ACCOUNT department");
       for(Emp x: l2)
		{
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
			
		}
       System.out.println("\n");
       Collections.sort(l3);
       System.out.println("Employee of SECURITY department");
       for(Emp x: l3)
		{
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
			
		}
       
		
	}

}
