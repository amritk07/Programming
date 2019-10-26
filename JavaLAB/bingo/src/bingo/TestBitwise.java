package bingo;

public class TestBitwise {
     static int count = 0;
	public static int countSetbit(int n)
	{
		while(n>0)
		{
		count += (n&1);
	    n =	n>>1;
		}
		return count;
	}
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,2,9,3,3,2,5,7,6,7,6,};
		int uni=0;
		for(int i =0;i<a.length;i++)
		{
			uni = uni^a[i];
			
		}
	    System.out.println("UNIQUE: "+uni);
	    int k = 2;
	    if((k & 1)==1)
	    {
	    	System.out.println("odd");
	    }
	    else {
	    	System.out.println("Even");
	    }
	    System.out.println("Setbits: "+countSetbit(13));
	}

}
