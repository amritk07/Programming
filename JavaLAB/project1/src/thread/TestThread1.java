package thread;
class Mythread1 implements Runnable
{    
	String threadname;
    Mythread1(String threadname)
    {
     this.threadname= threadname ;	
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("The name is "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId());
	}
	
}
public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The name is "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId());
		    //MyThread t1 = new MyThread("subthread");
		   // t1.start();
		    for(int i=0;i<5;i++)
		    {
		    	 Thread t1 = new Thread(new Mythread1(""+i));
		    	    t1.start();
		    }
	}

}
