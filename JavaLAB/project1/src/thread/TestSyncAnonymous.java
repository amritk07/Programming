package thread;
class TestTable3
{
public	synchronized void showTable(int k)
	{
	for(int i=1;i<=5;i++)
	{
	  System.out.println(k*i);
	  try
		{
			Thread.sleep(1000);
		}
	   catch(Exception e)
	   {
		
	   }
	 }
   }
}
public class TestSyncAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final TestTable3 t = new TestTable3();
       Thread t1  = new Thread()
    	   {
    	        public void run()
    	        {
    	        	t.showTable(5);
    	        }
    	    };
    	    Thread t2  = new Thread()
     	   {
     	        public void run()
     	        {
     	        	t.showTable(100);
     	        }
     	    };
     	    t1.start();
     	    t2.start();
	}

}
  