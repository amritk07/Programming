//1)	Write a program for searching strings for the first occurrence of a character 
//or substring and for the last occurrence of a character or substring
import java.util.Scanner;
class Search
{
	Scanner input = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter a string");
		String s1 = input.nextLine();
		System.out.println("Enter a charcter");
		char s2 = input.next().charAt(0);
		String s3 = s1.toLowerCase().replaceAll("\\s", "");
		check(s3,s2);
	}
	void check(String s1,char s2)
	{
		int i = s1.indexOf(s2);
		System.out.println("First occurence is at index: "+i);
	    i = s1.lastIndexOf(s2);
		
		
		System.out.println("Last occurence is at index: "+i);
	
}

}




public class Exp_8_prog1 {

	public static void main(String[] args) {
		
		Search s1 = new Search();
		s1.getInput();

	}

}
