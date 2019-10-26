package project1;
import java.util.Arrays;
import java.util.Scanner;

public class Tostring {
     
     
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] str = {"Apple","Mango","Grapes"};
		for( int i = 0; i < str.length; i++)
		{
		    String element = str[i];
		    System.out.println( element );    
		}
		
		/*for( int i = 0; i < str.length; i++){ System.out.println( str[i] );    }*/
		
		String[] stri = new String[5];
		System.out.println("Enter element in string array");
		for(int i=0;i<stri.length;i++) {
		
			stri[i] = input.next();
			}
		String theString = Arrays.toString( str );
		System.out.println( theString );
		Arrays.sort(str);
		for(int i =0;i<str.length;i++)
		{
			 System.out.println( str[i]);   
		}
		// char c = input.next().charAt(0);
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	} }
