package collection;

import java.util.ArrayList;

import oracle.net.aso.x;

public class NewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		int arr[] = {1,2,3,4};
		int arr1[] = {2,3,4,5};
		for(int x : arr)
		{
			a1.add(x);
		}
		for(int x : arr1)
		{
			a2.add(x);
		}
		System.out.println(a1.containsAll(a2));//false
		//int size()
		//boolean isEmpty()
		//boolean contains()
		//a1.clear();
		System.out.println(a1);
		
		
	}

}
