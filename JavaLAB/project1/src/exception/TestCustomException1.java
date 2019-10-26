package exception;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 } 
	 public String toString()
	 {
		 return "invalid Age exception";
	 }
	}  
public class TestCustomException1{  
		  
		     void validate(int age)throws InvalidAgeException{  
		     if(age<18)  
		      throw new InvalidAgeException("not vote");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		     
		   public static void main(String args[]){  
			   TestCustomException1 t1 = new TestCustomException1();
		      try{  
		      t1.validate(11);  
		      }catch(InvalidAgeException m){
		    	  System.out.println("Exception occured: "+m);}  
		  
		      System.out.println("rest of the code...");  
		  }  
}