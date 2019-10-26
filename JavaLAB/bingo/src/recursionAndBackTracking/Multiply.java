package recursionAndBackTracking;

public class Multiply {
public static int mult(int a,int b)
{
	if(a>0&&b>0)
	{
	if(b==1)
	{
		return a;
	}
	else {
		return a + mult(a, b-1);
	}
	
	}
	if(a<0)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
    if(b==-1)
    {
    	return -a;
    }
    return -a + mult(a, 1+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(mult(-8, 77));
	}

}
