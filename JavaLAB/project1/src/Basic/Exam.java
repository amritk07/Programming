package Basic;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s1 ="hello, hlss";
		int i = s1.length();
		char[] ch = s1.toCharArray();
		int j = ch.length;
		int[] arr = new int[5];
		int k = arr.length;
		char s[]=new char[8];
        s1.getChars(1,8,s,0);
        System.out.println(s);*/
		/*String s1 = "hello world";
		String[] s2 = s1.split(" ");
		System.out.print(s2[1]);*/
		StringBuffer s1 = new StringBuffer("hello ");
		s1.append("java");
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer();
		System.out.println(s2.capacity());
		s2.append("hello ");
		System.out.println(s2.capacity());
		s2.append("java");
		System.out.println(s2.capacity());
		System.out.println(s2);
	}

}
