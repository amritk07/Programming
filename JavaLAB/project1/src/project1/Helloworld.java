package project1;

class Box

{
	int h,b,l;
}
public class Helloworld {
	public static void main(String args[]) {
	/*System.out.println("Hello World");
    int k =3;
    System.out.println(++k*8);
    int[] x = {1,2,3,4};
    char[] y = {'a','b','c','d'};
    for(int i=0; i <x.length; i +=2)
    	for(int j = y.length-1; j>0;j--)
    		if(((i+j)%2)==0)
    	System.out.print(x[i]);
    		else
    			System.out.print(y[j]);*/
    Box b1 = new Box();
    Box b2 = new Box();
    b1.h = 1;
    b1.l = 2;
    b1.b = 3;
    b2 = b1;
    System.out.print(b2.h);
    
    /*int x = 9;
    if(x==9) {
    	
    	int x = 8;duplicate local variable 
    }*/
    	
    
    
    
}
}