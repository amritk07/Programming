package exception;

public class TryFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i  = Integer.parseInt(args[0]);
          try {
			if(i>5)
			{
				int k = i/0;
				
		    } 
			// TODO: handle exception
		}
          catch (Exception e) {
			// TODO: handle exception
        	  System.out.println(e);
		}
          finally {
        	  
        		System.out.println("Exception ocuured");  
        	  
		}
	}

}
