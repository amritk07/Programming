
public class Exp8_prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer i = new Integer("34");
		//Float f = new Float(i.floatValue());
		//Integer k = new Integer(( f.intValue()));
		String s1="45";
		int i1 = Integer.parseInt(s1);
		System.out.println("String to int:"+i1);
		
		Integer i2 = Integer.valueOf(s1);
		System.out.println("String to Integer: "+i2);
		
		int j= 23;
		String s2 = String.valueOf(j);
		System.out.println("int to String: "+s2);
		
		Integer i3 = Integer.valueOf(s2);
		int  k1 = i3.intValue();
		System.out.println("int to Integer: "+k1);
		String s4 = String.valueOf(i3);
		System.out.println("Integer to string: "+s4);

	}

}
