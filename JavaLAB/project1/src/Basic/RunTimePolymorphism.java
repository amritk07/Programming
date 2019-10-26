package Basic;
class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Base b = new Derived(); //Derived::show() called

        b.show();
        //new Derived().show();
    }
}

/*class Base {
    final public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}*/


//Final methods cannot be overridden. See the compiler error here.