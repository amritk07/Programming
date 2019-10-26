package balance;
import java.util.Scanner;
public class Account {
	Scanner input = new Scanner(System.in);
	public String accno;
	public String name;
	public int  bal;
	
 public	void getAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=input.next();
		System.out.print("Enter Name: ");
		name=input.next();
		System.out.print("Enter Balance: ");
		bal=input.nextInt();
	}
public void display_Balance()
{
	System.out.println("ACCOUNT NO. "+accno+"\n"+"ACCOUNT HOLDER: "+name+"\n"+"BALANCE: Rs"+bal);
}
}
