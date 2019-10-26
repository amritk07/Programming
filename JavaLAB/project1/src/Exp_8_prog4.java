import java.util.Scanner;
class Name1
{
	Scanner input = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter a string");
		String s1 = input.nextLine();
		String s2 = s1.toLowerCase().replaceAll("\\s", "");
		System.out.println("Enter a character");
		char c = input.next().charAt(0);
		count(s2,c);
	}
	void count(String s2,char c)
	{
	    int count1=0;
		int count2=0;
		char arr[]= s2.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
				{ 
					count1=i;
					System.out.println("INDEX: "+count1);
					count2++;
				}
	    }
		System.out.println("Character: "+" "+c+" "+ " \n" +"COUNT: " + count2);
		  if(count1==0)
		  {
			System.out.print("Character is not found");  
		  }
		}
	  
	  
	} 

	
public class Exp_8_prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Name1 n1 = new Name1();
    n1.getInput();
	}

}
