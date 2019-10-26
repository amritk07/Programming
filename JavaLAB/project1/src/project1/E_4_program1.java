//	Write a Java program to show that private member of a super class cannot be accessed from derived classes. 
package project1;

class Sum {
	
	int a,b;
private void input(int x, int y){
		a = x;
		b = y;
	 }
	void printoutput() {
	 System.out.println("SUM :"+(a+b));			
		}
	}

class D extends Sum {
 D(int x, int y)
{
	a = x; b =y;
}
 
 void show()
 {
	System.out.println("Result after substraction: "+(a-b));
 }
}
 
public class E_4_program1 {

	public static void main(String[] args) {
		
      D  g =new D(9,1);
		g.show();
		g.input(5,6);
		
		
}
}
