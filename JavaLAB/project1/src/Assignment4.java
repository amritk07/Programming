import java.util.Scanner;
class Palindrome

{
	Scanner input = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter a line");
		String line = input.nextLine();
		String line2 = line.toLowerCase().replaceAll("\\s", "");
		check(line2);
	}
	void check(String p)
	{
		int count=0;
		char[] chArray = p.toCharArray();
		int n=chArray.length;
		/*for(int i=0;i<n;i++)
		{
			System.out.println(chArray[i]);
		}*/
		//System.out.println("Size is: "+n);
		for(int i=0;i<=n/2;i++)
		 {
			 
			 if(chArray[i]!=(chArray[n-i-1]))
			 {
				// System.out.println("Not equal: "+chArray[i]);
				count++;
				break;
			 }
		 }
		if(count==1)
		{
			System.out.println("Line is not Palindrome");
		}
		else
			System.out.println("Line is Palindrome");
			
	} 
	
}
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Palindrome p = new Palindrome();
    p.getInput();
    
	}

}
