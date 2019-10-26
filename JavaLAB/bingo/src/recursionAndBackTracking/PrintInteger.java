package recursionAndBackTracking;



public class PrintInteger {
public static final String a[] = { "zero ","one", "two","three","four","five","six",
		"seven","eight","nine"};
public static void print(int n)
{
	if(n==0)
	{
		return;
	}
	print(n/10);
	System.out.print(a[n%10]+" ");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          print(345);
	}

}
