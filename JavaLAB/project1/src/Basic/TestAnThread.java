package Basic;
class Table
{
	synchronized void pritnTable(int n)
	{
		for(int j = 1;j<5;j++)
		{
			System.out.println(n*j);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
}
public class TestAnThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table t = new Table();
         new Thread() {
        	
        	public void run()
        	{
        		t.pritnTable(5);
        	}
        	
        	
        }.start();
        
       new Thread() {
        	
        	public void run()
        	{
        		t.pritnTable(10);
        	}
        	
        	
        }.start();
        
		
		
		
	}

}
