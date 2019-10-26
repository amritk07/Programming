package collection;

import java.util.ArrayList;
//boolean containsAll(Collection<?> c)
//boolean addAll(Collection<? extends E> c) 
//boolean removeAll(Collection<?> c) 
//boolean retainAll(Collection<?> c)
public class TestList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> l = new ArrayList<Integer>();
 ArrayList<Integer> m = new ArrayList<Integer>();
 int[] v1 = {1,2,3,4,5,6,7,8,9,10};
 int[] v2 =  {1,2,3,4,5,11};
 for(int x : v1)
 {
	 l.add(x); 
 }
 for(int x : v2)
 {
	 m.add(x); 
 }
 System.out.println("containsAll: " +l.containsAll(m));
boolean b = l.addAll(m);
//System.out.println(b);
System.out.println("containsAll after addAll: " +l.containsAll(m));
for(int x : l)
{
	 System.out.print(x +" "); 
}
 
/*for(int x : m)
{
	 System.out.print("\n"+x +" "); 
}*/
 l.removeAll(m);//common element will be removed
 
 System.out.print("\n");
 for(int x : l)
 {
 	 System.out.print(x +" "); 
 }
 l.add(11);// after remove no common element will be presetn in l, i add 11 to l to perforem retainall
 l.retainAll(m);//common element will be preserved 
 System.out.print("\n");
 for(int x : l)
 {
 	 System.out.print(x +" "); 
 }
 }

}
