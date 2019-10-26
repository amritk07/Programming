package string;
import java.util.Scanner;
class Line
{
	Scanner input = new Scanner(System.in);
	//String str = "testing";
	//StringBuffer tmp = new StringBuffer(str);
	//tmp.append("abc");
	//str = tmp.toString();
	void merge(String str1,String str2)
	{
		StringBuffer m = new StringBuffer(str1);
		m.append(" " +str2);
		str1 = m.toString();
		System.out.println(str1);
		
	}
	void getInput()
	{   
		
		System.out.println("Enter first line:");
		String s1 = input.nextLine();
		System.out.println("Enter first line:");
		String s2 = input.nextLine();
		merge(s1,s2);

	}
}
// Make a method sort that take an string array return it in alphabetical order
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Line l = new Line();
   l.getInput();
	}

}
