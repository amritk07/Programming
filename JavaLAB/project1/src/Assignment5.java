import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
		System.out.println("Enter first paragraph");
		String p1 = in.nextLine(); 
		System.out.println("Enter Second paragraph");
		String p2 = in.nextLine(); 
		String p3 = p1+p2;
		//System.out.print(p3);
		String arr[] = p3.split(" ");
		int n = arr.length;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i].compareTo(arr[j])>0) 
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
