
public class Exp_9_5 {  
	  public static void main(String[] args) {  
	    final String s1 = "UPES";  
	    final String s2 = "OSS";
	    final String s3 = "Dehradun";
	    Thread t1 = new Thread() {  
	      public void run() {  
	    	  System.out.println("Thread 1 is going to lock resource 1");
	          synchronized (s1){ 
	           System.out.println("Thread 1 locked resource 1");  
	  
	           try { Thread.sleep(500);}
	           catch (Exception e) {}  
	  
	           synchronized (s2){
	            System.out.println("Thread 1 locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	    
	    Thread t2 = new Thread() {
	      public void run() {
	    	  System.out.println("Thread 2 is going to lock resource 2");
	        synchronized (s2) {  
	          System.out.println("Thread 2 locked resource 2");  
	  
	          try { Thread.sleep(500);} 
	          catch (Exception e) {}  
	  
	          synchronized (s3) {  
	            System.out.println("Thread 2 locked resource 3");  
	          }  
	        }  
	      }  
	    };  
	  
	    Thread t3 = new Thread() {  
		      public void run() {  
		    System.out.println("Thread 3 is going to lock resource 3");
		        synchronized (s3) {  
		          System.out.println("Thread 3 locked resource 3");  
		  
		          try { Thread.sleep(500);}
		          catch (Exception e) {}  
		  
		          synchronized (s1) {  
		            System.out.println("Thread 3 locked resource 1");  
		          }  
		        }  
		      }  
		    }; 
	    
	    t1.start();  
	    t2.start();
	    t3.start();
	  }  
	}  
	       
 