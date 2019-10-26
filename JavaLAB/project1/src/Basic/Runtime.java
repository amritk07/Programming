package Basic;

class Base2 {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived1 extends Base2 {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class Runtime {
    public static void main(String[] args) {
        Base2 b = new Derived1();; 
        b.show();//Base::show() called when a function is static, runtime polymorphism doesn't happen.
    }
}
