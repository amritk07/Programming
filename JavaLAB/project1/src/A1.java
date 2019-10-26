/*import project1.*;//If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print f = new Print();
		f.msg();

	}

}
*/
/*import project1.Print;//only declared class will be accessible.
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print f = new Print();
		f.msg();
		f.msg();
		A1 d = new A1();
		//A1.msg(); not accessible.

	}

}*/
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		project1.Print f = new project1.Print();//fully qualified name(no need to write import package statement)
		f.msg(); 
		f.msg();
		f.msg();
		
	
} }