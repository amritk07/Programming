package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FinalPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	  Connection cn = Myconnection.createMyconnection();
	   // System.out.println(cn);
        String s1 = args[0];
        String arr1[] = s1.split(",");
        int arr[] = new int[arr1.length];
        for(int i =0;i<arr1.length;i++)
        {
         arr[i] = Integer.parseInt(arr1[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		PreparedStatement p1 = cn.prepareStatement("insert into even values(?)");
        		p1.setInt(1, arr[i]);
        		System.out.println(p1.executeUpdate());
        	}
        	else {
        		PreparedStatement p1 = cn.prepareStatement("insert into odd values(?)");
        		p1.setInt(1, arr[i]);
        		System.out.println(p1.executeUpdate());
			}
        }
        
        //System.out.println(14%3);
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
	}

}
