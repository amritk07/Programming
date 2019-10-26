package Basic;
import java.util.Scanner;

/*public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a integer");
		int num = input.nextInt();
		System.out.println("Enter a number");
		input.nextLine();//why?
		String name = input.nextLine();
		System.out.println("NO: "+num+" Name: "+name);
	}

}*/
public class Test {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter");
        int N = scanner.nextInt();
       // int result=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
           
            System.out.println(N + "x" + i +  "=" + N*i);
        }

        scanner.close();
    }
}



