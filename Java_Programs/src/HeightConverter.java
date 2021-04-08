

import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
//		1 inch = 2.54 centimeter
//		1 feet = 30.48 centimeter

		double inch,centimeter,feet;
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice ");
		System.out.println("1.Convert Inches to Centimeter");
		System.out.println("2.Convert Centimeter to Inches"); 
		System.out.println("3.Convert Feet to Centimeter");
		choice =sc.nextInt();
	    switch(choice) {
	    case 1:
	    	System.out.println("Enter no.of inches");
	    	inch=sc.nextDouble();
	    	centimeter=2.54*inch;
	    	System.out.println(inch+" Inches = "+centimeter+" Centimeters");
	        break;
	    case 2:
	    	System.out.println("Enter no.of Centimeter");
	    	centimeter=sc.nextDouble();
	    	inch=0.3937*centimeter;
	    	System.out.println(centimeter+" Centimeters = "+inch+" Inches");
	        break;
	    case 3:
	    	System.out.println("Enter no.of feets");
	    	feet=sc.nextDouble();
	    	centimeter=30.48*feet;
	    	System.out.println(feet+" feets = "+centimeter+" Centimeters");
	        break;
	    default:   
            System.out.println("please enter the correct choice");   
	    }

	}

}
