package Basic;
class Animal{  
	protected int b1 =10;
	
/*void bark()
{
	System.out.println("eating..."); 
}*/  
}
class Dog extends Animal
{  
void bark()
{
	b1 =19;
	//System.out.println("barking...");
	System.out.println(b1);
	}  
} 
class Cat
{
	Animal a1 = new Animal();
	
	void display()
	{
	a1.b1=14;
	
	System.out.println("Protected: "+a1.b1);
	}
}
	

 
 
public class TestInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		//Animal a = new Animal();
		d.bark();  
		//a.bark();  
		Cat v = new Cat();
		v.display();
	 
	}

}
