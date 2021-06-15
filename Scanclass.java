import java.util.Scanner;
class Scanclass{
public static void main(String []args){
	Scanner obj=new Scanner(System.in);
	System.out.println("ENTER THE FIRST NAME LAST NAME AND AGE");
	String Firstname=obj.nextLine();
	String Lastname=obj.nextLine();
	String Age=obj.nextLine();
	System.out.println("name is"+Firstname+" "+Lastname+""+Age);
}
}