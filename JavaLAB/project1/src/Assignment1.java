import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String w = input.nextLine();
		String w1 = w.toLowerCase();
		String[] str = w1.split(" ");
	int[] count = new int[str.length];
	
		for(int i=0;i<str.length;i++)
		{
			int sum=0;
			for(int j=0;j<str[i].length();j++)
			{
if(str[i].charAt(j)=='a'||str[i].charAt(j)=='e'||str[i].charAt(j)=='i'||str[i].charAt(j)=='o'||str[i].charAt(j)=='u')
{
	sum++;
	
}
count[i]=sum;	
}
		}
	for(int i=0;i<str.length;i++)
	{
		System.out.println("Word: "+str[i]+" Count: "+count[i]);
	}
		
		
		
		
		
		
		
		
	}
	

}
