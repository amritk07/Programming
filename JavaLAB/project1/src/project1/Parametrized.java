package project1;

class Employee {
	String name,id;
	Employee(String j, String k)
	{
		name = j; id = k;
		
		
	}
}
	class Output {
		Output()
		{
			System.out.print("Output constructor");
			
		}
	void	show()
		{
		Employee e = new Employee("Amrit kumar","500062268"); // this line override the constructor of main
			System.out.print("Name of Emp: "+e.name + "ID: "+e.id);
			
		}
		
		
	}
	/* class Emp extends Employee
	{

		Emp(String j, String k) {
			super(j, k);
			// TODO Auto-generated constructor stub
		}
		
		
		
	} */
	
	
	

public class Parametrized {

	public static void main(String[] args) {
	 Employee e= new Employee("Amrit","1wwdiwj3");
	 Output o = new Output();
	 o.show();
	 

	}

}
