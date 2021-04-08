

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator2 {

	public static void main(String[] args) {
		//using random class
		Random random = new Random();  
	    int upperbound = 50;
	    int int_random = random.nextInt(upperbound); 
	    double double_random=random.nextDouble();
	    float float_random=random.nextFloat();
	      
	      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
	      System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
	      System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
	      
	      //Using ThreadLocalRandom
	      double double_rand = ThreadLocalRandom.current().nextDouble(); 
	      System.out.println("Random Doubles: " + double_rand); 
	      boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();  // Generate random booleans 
	      System.out.println("Random Booleans: " + boolean_rand); 
	      
	      //using Math.random
	      int min = 50;
	      int max = 100;
	      //Generate random double value from 50 to 100 
	      System.out.println("Random value in double from "+min+" to "+max+ ":");
	      double random_double = Math.random() * (max - min + 1) + min; 
	      System.out.println(random_double);
	        
	      //Generate random int value from 50 to 100 
	      System.out.println("Random value in int from "+min+" to "+max+ ":");
	      int random_int = (int)(Math.random() * (max - min + 1) + min);
	      System.out.println(random_int);
	    }
}


