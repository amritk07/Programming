package basic;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Arraysss {
	static ArrayList<Integer> b1 = new ArrayList<Integer>();
	static int count = 1;
	static int i = 2;
public static ArrayList<Integer> merge(ArrayList a1 , int n,int l)
{
	
	if(n>0)
	{
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	int t;
	
	if(count==1)
	{
		t = n;
	}
	else {
		t = count;
	}
	count = i *n;
	
	for(int k = 1;k<=t;k++)
	{
	for(int i =0;i<n;i++)
	{
		l1.add((Integer) a1.get(i));
	}
	}
	//l1.addAll(l1);
   
	b1.addAll(l1);
	return merge(a1, n/i, l);
	}
	i++;
	return b1;
	

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> s1 = new ArrayList<Integer>();
         s1.add(1);
         s1.add(2);
         s1.add(3);
         s1.add(4);
         int n = s1.size();
         s1 = merge(s1, n,n);
         System.out.println(s1);
	}

}
