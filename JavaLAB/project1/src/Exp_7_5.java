import java.util.Scanner;
class InvalidAge extends Exception{

    @Override
    public String toString() {
        return "InvalidAge Exception"; 
    }
}
 class InvalidName extends Exception{

    @Override
    public String toString() {
        return "InvalidName Exception"; 
    }

    
    
}
class Employee1{
    String name;
    int age;
}
 public class Exp_7_5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Employee1 emp = new Employee1();
        boolean b;
        System.out.println("Enter name");
        emp.name=input.nextLine();
         System.out.println("Enter age ");
         emp.age=input.nextInt();

         char[] ch = emp.name.toCharArray();
        try {
            for(int i=0;i<emp.name.length();i++)
            {
            	b = Character.isDigit(ch[i]);
                if(b==true)
                {
                  throw new InvalidName();
                }
               
             
            }
           try {
                
                if(emp.age>50)
                {
                    throw  new InvalidAge();
                }
               } 
           catch (InvalidAge e) {
                e.printStackTrace();
            }
        } catch (InvalidName e) {
            e.printStackTrace();
        }
        System.out.println("NAME: "+emp.name);
        System.out.println("Age: "+emp.age);
    }
    
}
