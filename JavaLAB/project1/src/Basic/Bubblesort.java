package Basic;
import java.util.Scanner;
class Element
{    
	Scanner in = new Scanner(System.in);
	int arr[] = new int[5];
	void getInput()
	{
		System.out.println("Enter elments ");
		for(int i=0;i<arr.length;i++)
		{
		  arr[i] = in.nextInt();
		}
	}
	void sort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			} 
			}
			for( int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
				
			
		}
		
	}
	public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Element t1 = new Element();
		t1.getInput();
		t1.sort();
		
		
		
	}

}
