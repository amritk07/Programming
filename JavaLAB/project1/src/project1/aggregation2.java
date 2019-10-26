package project1;
class Book
{
	String name;
	 int price;
	 Author auth;
	 Book(String name,int price,Author auth)
	 {
		 this.name=name;
		 this.price=price;
		 this.auth=auth;
	 }
	public void showdetails()
	{
		System.out.println("Book is "+name);
		System.out.println("Price is "+price);
		System.out.println("Author is "+auth.getauthorname());
		System.out.println("Age of "+auth.getauthorname()+ "is "+auth.getage());
		
	}
	
}
class Author
{
	 String authorName;
	 int age;
	 Author(String authorname,int age)
	 {
		 this.authorName=authorname;
		 this.age=age;
	 }
	 public String getauthorname()
		{
			return authorName;
		}
	 public int getage()
		{
			return age;
		}
	
	
}
public class aggregation2 {
	public static void main(String args[]) {
	Author q = new Author("AMRIT",68);
	Book b = new Book("JAVA",1000,q);
	  b.showdetails();
}
	
	}
