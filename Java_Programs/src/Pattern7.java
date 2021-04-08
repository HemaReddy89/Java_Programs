import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
	 
	  String result;
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter marks obtained");
	  int marks=sc.nextInt();
	  result=(marks<33)? "fail" : "Pass" ;
	  
	  System.out.println("Result is = 	"+result);
	  
	}

}
