/*	Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning.
 * The charges depend on the duration and the type of the call. calculate the charges.
 */

class Trunkcall
{
	float min;
	float rate;
	
	void calulate() {
		float total;
		total = min*rate;
		System.out.println(total);
		
	}
	
}
class Ordinary extends Trunkcall{

		Ordinary(float min, float rate) {
			this.min = min;
			this.rate = rate;
			// TODO Auto-generated constructor stub
			System.out.print("Charges of Ordinary call: ");
		}
		
}
	
class Urgent extends Trunkcall{

	Urgent(float min, float rate) {
		this.min = min;
		this.rate = rate;
		System.out.print("Charges of Urgent call: ");
	}
	
	
	
}

class Lightning extends Trunkcall{

	Lightning(float min, float rate) {
		this.min = min;
		this.rate = rate;
		System.out.print("Charges of Lightning call: ");
	}
	
	
	
}

public class EX4_prog4{
	
	public static void main(String args[])
	{
		Trunkcall t = new Trunkcall();
		t = new Ordinary(4.3f,5.2f); // runtime polymorphism.
		t.calulate();
		t = new Urgent(3.1f,8.5f);
		t.calulate();
		t = new Lightning(4.1f,2.0f);
		t.calulate();
		
	}
	
	
	
	
	
	
	
}

