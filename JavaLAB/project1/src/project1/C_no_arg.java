package project1;
class Country
{
	Country(){
		
		System.out.println("Name of my Country:");
		
	}
	
	
}

class India extends Country{
	
	India()
	{
		System.out.print("INDIA");		
	}
	
	
}



public class C_no_arg {

	public static void main(String[] args) {
		
	  
	India a = new India(); // the value of local variable is not used

	}

}

