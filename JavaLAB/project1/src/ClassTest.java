class Count
{
	int Countvowel(String s)
	{
		return 0;
		
	}
	
	
}



public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Count c1 = new Count()
				{
			
			  int Countvowel(String s)
			  { 
				  s= s.replaceAll("\\s", "");
				  int count=0;
				  char[] c1 = s.toCharArray();
				  for(int i=0;i<c1.length;i++)
				  { 
					  
			 if(c1[i]== 'a' || c1[i]=='e'|| c1[i]=='i'|| c1[i]=='o'|| c1[i]=='u')
			     {
						 
						count++; 
				 }
				 }
				 
				return c1.length-count;
			
				  
			  }
			
			};
			System.out.println("No. of non-vowel: "+c1.Countvowel("hello s f"));
		
	}

}
