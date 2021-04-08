

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		
		  double x = 0,y=0;
    	  Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the value of x : ");
		  x = scanner.nextDouble();  
		  System.out.println("Enter the value of y : ");
		  y = scanner.nextDouble();
          System.out.println();
          double result = x * y / 100;
		  System.out.println("percentage : (x % of y) : "+ result );
		 }

	

}
