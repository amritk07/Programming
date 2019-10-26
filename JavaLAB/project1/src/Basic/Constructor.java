package Basic;



public class Constructor {
	int i;
     Constructor() {
		// TODO Auto-generated constructor stub
    	i = 10;
	}
    Constructor(int i)
    {
    	this.i =i;
    }
  public void  displayMode()
    {
    	System.out.println(i);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(5);
		c1.displayMode();
		c2.displayMode();
		
	}

}
