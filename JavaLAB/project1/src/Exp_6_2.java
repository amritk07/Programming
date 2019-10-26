import java.util.Scanner;
import balance.*;
class Bank{
	Scanner in = new Scanner(System.in);
	Account s = new Account();
	Bank(){
	
		s.getAccount();
		System.out.println("Account details");
		s.display_Balance(); }
	
		void withdraw() {
	    System.out.println("Enter the ammount(Rs) to withdraw(minimum Rs100 )");
		int am = in.nextInt();
		if(am<100&&am<=s.bal)
		{
			System.out.println("WARNNING!! TRANSACTION FAILED!!");
		}
		else {
		s.bal = s.bal- am;
		System.out.println("Account details after withdrawal of Rs "+am); 
		
		
		s.display_Balance(); 
		}
	
	}}

public class Exp_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bank b = new Bank();
 b.withdraw();
	}

}
