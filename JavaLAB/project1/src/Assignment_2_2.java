
import java.util.*;

class Emp1 implements Comparable<Emp1>
{
  double sal;
  String name;
  String dep;
  int age;
	Emp1(String name,int  age, double sal, String dep)
	{
		this.name = name;
		this.age = age;
		this.sal = sal;
	    this.dep = dep;
	    
	    
	}
	public int compareTo(Emp1 arg0) {
		// TODO Auto-generated method stub
		return this.age-arg0.age;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
public class Assignment_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
       ArrayList<Emp1> li = new ArrayList<Emp1>();
       ArrayList<Emp1> l1 = new ArrayList<Emp1>();
       ArrayList<Emp1> l2 = new ArrayList<Emp1>();
       ArrayList<Emp1> l3 = new ArrayList<Emp1>();
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
    	   li.add(new Emp1(s1,s2,s3,s4));
    	   
       }
       
        for(Emp1 x: li)
       {
    	  if(x.dep=="IT")
    	  {
    	 l1.add(new Emp1(x.name,x.age,x.sal,x.dep)) ;
    	  }
    	  if(x.dep=="ACCOUNT")
    	  {
    	 l2.add(new Emp1(x.name,x.age,x.sal,x.dep)) ;
    	  }
    	  if(x.dep=="SECURITY")
    	  {
    	 l3.add(new Emp1(x.name,x.age,x.sal,x.dep)) ;
    	  }
       }
       Collections.sort(l1);
       System.out.println("Employees of IT department");
       for(Emp1 x: l1)
		{
    	   if(x.sal>10000)
			System.out.println("Name: "+ x.name+" "+"Age: "+ x.age+" "+"Sal: "+ x.sal);
			
		}
       System.out.println("\n");
       Collections.sort(l2);
       if(l2.isEmpty())
       {
       System.out.println("No records found in Account department");
       }
       else 
       {
       System.out.println("Employees of ACCOUNT department");
       for(Emp1 x: l2)
		{
    	    if(x.sal>10000)
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
			
		}}
       System.out.println("\n");
       Collections.sort(l3);
       if(l3.isEmpty())
       {
       System.out.println("No records found in security department");
       }
       else
       {
       System.out.println("Employees of SECURITY department");
       for(Emp1 x: l3)
		{
    	   
    	    if(x.sal>10000)
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
			
		
		}
       
		
	}

}}

