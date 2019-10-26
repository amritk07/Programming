import java.util.*;
class Word
{ 
	Scanner input = new Scanner(System.in);
	void getWord()
	{
	 System.out.println("Enter word");
	 String w = input.next();
	 System.out.println("Enter key");
	 int k = input.nextInt();
	 String word= key(w,k);
	 System.out.println("Original word: "+w);
	 System.out.println("New word: "+word);
	}
	
	String key(String w1, int k)
	{	
		String w = w1.toLowerCase();
		char[] ch = w1.toCharArray();
	  for(int i=0;i<w1.length();i++)
	  {
		int ascii = ch[i];
		ascii+=k;
		if(ascii>122)
		{
			ascii = ascii-26;
			ch[i] = (char)ascii;
		}
		else
		{
		ch[i]= (char)ascii;
		}
		
	  }
	  String w2 = new String(ch);
	  return w2;
	}
	
}
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Word w = new Word();
     w.getWord();
	}

}
