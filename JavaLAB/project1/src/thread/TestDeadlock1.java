package thread;

public class TestDeadlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    final String s1 = "Hello";
    final String s2 = "World";
    Thread t1 = new Thread()
    		{
    	       public void run()
    	       {
    	    	   synchronized(s1)
    	    	   {
    	    		   System.out.println("Thread 1: locked s1 ");
    	    	   
    	    	   try
    	    	   {
    	    		   Thread.sleep(1000);
    	    	   }
    	    	   catch(Exception e) {} 
    	    	   synchronized(s2)
    	    	   {
    	    		   System.out.println("Thread 1: locked s2 ");
    	    	   }
    	    	   }  
    	       }
    	
    		};
    		Thread t2 = new Thread()
    		{
    	       public void run()
    	       {
    	    	   synchronized(s2)
    	    	   {
    	    		   System.out.println("Thread 2: locked s2 ");
    	    	   
    	    	   try
    	    	   {
    	    		   Thread.sleep(1000);
    	    	   }
    	    	   catch(Exception e) {}
    	    	   synchronized(s1)
    	    	   {
    	    		   System.out.println("Thread 2: locked s1 ");
    	    	   }
    	    	   }
    	       }
    	
    		};
    		t1.start();
    		t2.start();
    }

}
