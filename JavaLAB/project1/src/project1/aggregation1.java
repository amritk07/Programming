package project1;


class Employee{
String name;	
String empid;
float sal;
Employee(String name,String empid,float sal)
{
	this.name = name;
	this.empid = empid;
	this.sal = sal;
	
}
void show()
{
	System.out.println("NAME OF THE EMPLOYEE: "+name);
	System.out.println("EMP_ID: "+empid);	
	
}
void increaseSalary()
{
	sal = sal + 0.1f*sal;

	System.out.println("Salary after increasement: "+sal);
}
}
class Department{
	String dep_id;
	String dep_name;
	public Department(String did, String dname) {
		dep_id=did;
		dep_name=dname;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
class Manager extends Employee{
	Department d;
	
	Manager(String name, String empid, float sal,Department d) {
		super(name, empid, sal);
		this.d=d;
		
	}
		
		
		
	void show()
		{
			super.show();
			increaseSalary();
			System.out.println("Department name: "+d.dep_name);
			System.out.println("Department ID: "+d.dep_id);
		}
	
		}
public class aggregation1 {

	public static void main(String[] args) {
		
		Department d1=new Department("2","Account");
	Manager m = new Manager("TOM","R1234",20000,d1);
	m.show();

	}}

