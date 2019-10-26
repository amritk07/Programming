package Basic;
interface T1
{
	int i = 10;
	void msg();
	
}
public class TestAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 a = new T1()
				{

					@Override
					public void msg() {
						// TODO Auto-generated method stub
						System.out.println(i);
					}
			
			
			
				};
               a.msg();
	}

}
