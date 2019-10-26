import java.util.Scanner;
public class Assignment2 {
public static void main(String args[])
{
	System.out.println("Enter string");
Scanner s = new Scanner(System.in);
String str;

str = s.nextLine();
String strArray[] = str.split(" ");
int sum=0;
for(int i=0;i<strArray.length;i++)
{   
	sum=1;
	
	for(int j=0;j<strArray.length;j++)
	{   
	   {
		if(i!=j)
		{
		if(strArray[i].equals(strArray[j]));
		{
		sum++;
		
		}
		}
	    if(j==strArray.length-1)
	    {
	    	System.out.println(strArray[i]+" " + "Count: "+sum);
	    }
	 
	
	}
	}
	
}
}
}

