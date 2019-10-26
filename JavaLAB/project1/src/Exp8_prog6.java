
public class Exp8_prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 3.14f;
		String s1 = String.valueOf(f1);
		s1 = "32";
		System.out.println("float to String:"+s1);
		float f2 = Float.parseFloat(s1);
		System.out.println("String to float: "+f2);
		Float f3 = Float.valueOf(s1);
		System.out.println("String to Float: "+f3);
		Float f4 = Float.valueOf(f1);
		float f5 = f4.floatValue();
		System.out.println("float to Float: "+f5);
	   
	    String s2 = Float.toString(f1);
	    Float f6 = Float.valueOf(s2);
	    System.out.println("Float to float: "+f6);
	    
		
		

	}

}
