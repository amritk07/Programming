package innerclasses;
abstract class Maths extends Exception
{
	public String tostring()
	{
		return "math Exception";
	}

	abstract public void getInput(String string, String string2);
		// TODO Auto-generated method stub
	
}
public class InnerException {

0	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 Maths m1 = new Maths()
		{
	 public void getInput(String n1, String n2) throws Maths
			 {
				 
				
				 char[] num1 = n1.toCharArray();
				 char[] num2 = n2.toCharArray();
				 for(int i=0;i<num1.length;i++)
				 {
				   if(Character.isDigit(num1[i])==false)
					   throw new Maths();
			     }
				 for(int i=0;i<num2.length;i++)
				 {
				   if(Character.isDigit(num2[i])==false)
					   throw new Maths();
			     }
				 int a = Integer.parseInt(n1);
				 int b = Integer.parseInt(n2);
				 System.out.println("Sum: "+(a+b));


			 }
			 
			 
		};
		
		try
		{
		m1.getInput("3","34");
		}
		catch(Maths e)
		{
			
		}
	}

}
