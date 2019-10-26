package innerclasses;

interface Age
{
	int x =21;
	void getAge();
	
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Age a1 = new Age()
		   {

			@Override
			public void getAge() {
				// TODO Auto-generated method stub
				System.out.print("Age: "+x);
			}
	   
	   
		   };
		   a1.getAge();
	}

}
