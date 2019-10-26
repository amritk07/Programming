package Basic;
import java.util.*;
public class TestChar {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter");
		String s2 = s1.next();
		int count =0;
		
		char[] char1 = s2.toCharArray();
		for(int i =0;i<char1.length;i++)
		{
			if(char1[i]=='a'||char1[i]=='e'||char1[i]=='i'||char1[i]=='o'||char1[i]=='u')
			{
				count++;
			}
		}
           System.out.println("No. of vowel: "+count); 
           System.out.println("No. of constant: "+(char1.length-count));   
		
		
	}

}
