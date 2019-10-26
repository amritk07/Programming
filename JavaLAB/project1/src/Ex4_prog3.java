class Worker{
	
	String  name;
	int  salaryrate;
	Worker(String name, int salaryrate){
	this.name = name;
	this.salaryrate = salaryrate;
		
	}
	void display()
	{
		System.out.println("NAME: "+name);
	}
	
}

class Dailyworker extends Worker{

	Dailyworker(String name, int salaryrate) {
		super(name, salaryrate);
		
	}
	
	void ComPay(int h)
	{
		float days;
		display();
		days = h/24;
		System.out.println("Salary of Dailyworker: "+days*salaryrate);
		
	}

	
}



class Salariedworker extends Worker{

	Salariedworker(String name, int salaryrate) {
		super(name, salaryrate);
		
	}
	void ComPay()
	{
	   display();
	 System.out.println("Salary of salaridWorker: "+40*salaryrate);
	}
	
}
public class Ex4_prog3 {

	public static void main(String[] args) {
		Dailyworker d = new  Dailyworker("Tom",600);
		Salariedworker s  = new  Salariedworker("john",800);
		d.ComPay(50);
		s.ComPay();
	 

	}

}
