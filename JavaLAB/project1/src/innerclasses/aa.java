package innerclasses;

class aa{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	//first method
	  aa obj=new aa(); 
	  aa.Inner in1 = new aa().new Inner();
	  in1.msg();
	  //second method
	  aa.Inner in=obj.new Inner();  
	  in.msg();  
	  int c =3;
	  
	  int d=0;
	  d = c++;//no increment
	  System.out.println(d);
	  System.out.println(d);
	  d = ++c;
	  System.out.println(d);
	  int a=10;
	  a++;
	  System.out.println(a);
	  ++a;
	  System.out.println(a);
	  
	 }  
	}  
