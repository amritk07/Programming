
class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
public class This {

	    public static void main(String args[]){  
			A a=new A(10);
//when object created parametrized constructor invoked then inside A(int x) block this(); invoked default constructor
			
	}

}
