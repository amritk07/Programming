class Player {
String name;
int age;
String matchid;
Player(){
	
}
Player(String i,int j,String matchid)
{
	name = i;
	age =  j;
    this.matchid = matchid;
}
void display()
{
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
System.out.println("MATCH_ID : "+matchid);
}
}
 class Cricket_player extends Player{

	
Cricket_player(String i, int j, String matchid) {
	
		super(i, j, matchid);
		
}
public void display()
{
System.out.println("Details of Cricket PLayer");
super.display();
	 
	 
 } }
 class Football_player extends Player{

		
	 Football_player(String i, int j, String matchid) {
	 	
	 		super(i, j, matchid);
	 		
	 }
	  void display()
	 {
	 System.out.println("Details of Football PLayer: ");
	 super.display();
	 	 
	 	 
	  } }
 class Hockey_player extends Player{

		
	 Hockey_player(String i, int j, String matchid) {
	 	
	 		super(i, j, matchid);
	 		
	 }
	  void display()
	 {
	 System.out.println("Details of Hockey PLayer: ");
	 super.display();
	 	 
	 	 
	  } }
public class Ex4_prog2
{
	
	public static void main(String args[])
	{
		Cricket_player l = new Cricket_player("KOHLI",31,"R107");
		Football_player m = new Football_player("Cristiano Ronaldo",35,"W107");
		Hockey_player n = new Hockey_player("Anant",31,"R105");
		l.display();
		m.display();
		n.display();
		

	
}
}