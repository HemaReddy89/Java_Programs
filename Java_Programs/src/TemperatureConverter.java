

import java.util.Scanner;

public class TemperatureConverter {
	
	public static void main(String args[]) {
		
	//	c=(f-32)/1.8
	//	f=(c+32)*1.8
		
		double fahrenhiet,celsius,kelvin;
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice ");
		System.out.println("1.Convert Fahrenheit to Celsius");
		System.out.println("2.Convert Celsius to Fahrenheit"); 
		System.out.println("3.Convert from Fahrenheit to kelvin"); 
		choice =sc.nextInt();
	    switch(choice) {
		
		case 1:
			System.out.println("Enter temperature in Fahrenheit");
			fahrenhiet = sc.nextDouble();
			celsius=(fahrenhiet-32)/1.8;
			System.out.println(fahrenhiet+" Fahrenheit = "+celsius+" Celsius ");
			break;
		case 2:
			System.out.println("Enter temperature in Celsius");
			celsius = sc.nextDouble();
			fahrenhiet= (celsius*1.8)+32;
			System.out.println(celsius+" Celsius = "+fahrenhiet+" Fahrenheit ");
			break;
		case 3:
			System.out.println("Enter temperature in Fahrenheit");
			fahrenhiet = sc.nextDouble();
			kelvin=((fahrenhiet-32)/1.8)+273.15;
			System.out.println(fahrenhiet+" Fahrenheit = "+kelvin+" Kelvin ");
			break;	
		default:   
	            System.out.println("please enter the correct choice");  
		}
	}

	

}
