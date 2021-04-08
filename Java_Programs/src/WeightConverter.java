

import java.util.Scanner;

public class WeightConverter {
	
	public static void main(String args[]) {
		
//		1 kg= 2.2046 lb
//		1 pounds= 0.4536 kg
		double pound,kg,gram;
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice");
		System.out.println("1.Convert Pounds to Kilogram ");
		System.out.println("2.Convert Kilogram to pounds");
		System.out.println("3.Convert Gram to Kilogram");
		System.out.println("4.Convert Kilogram to Gram");
		System.out.println("5.Convert Pounds to Grams ");
		choice =sc.nextInt();
	    switch(choice) {
		
		case 1:
			System.out.println("Enter pounds");
			pound=sc.nextDouble();
			kg=2.2046*pound;
			System.out.println(pound+ " Pounds = "+kg+" kg(Kilograms)");
			break;
		case 2 :
			System.out.println("Enter Kilograms");
			kg=sc.nextDouble();
			pound=0.4536*kg;
			System.out.println(kg+ " Kilograms = "+pound+" lbs(Pounds)");
			break;
		case 3:
			System.out.println("Enter Grams");
			gram=sc.nextDouble();
			kg=0.001*gram;
			System.out.println(gram+ " grams = "+kg+" kg(Kilograms)");
			break;
		case 4:
			System.out.println("Enter kilograms");
			kg=sc.nextDouble();
			gram=1000*kg;
			System.out.println(kg+ " Kilograms = "+gram+" (Grams)");
			break;
		case 5:
			System.out.println("Enter pounds");
			pound=sc.nextDouble();
			gram=0.0022046*pound;
			System.out.println(pound+ " Pounds = "+gram+" gms(grams)");
			break;
		default:   
            System.out.println("please enter the correct choice");  
	    }
		
	}
	

}
