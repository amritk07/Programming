package innerclasses;

public class localInner2{  
	 private int data=30;//instance variable  
	 void display(){  
	 final int value=50;//local variable must be final till jdk 1.7 only  
	  class Local{  
	   void msg(){
		   System.out.println(value);
		   System.out.println(data);
		   }  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  localInner2 obj=new localInner2();  
	  obj.display();  
	 }  
	}  

