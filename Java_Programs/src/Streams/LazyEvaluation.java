package Streams;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values= Arrays.asList(12,10,88,100,15,66);
		System.out.println(values.stream()
			               	     .filter(LazyEvaluation::isDivisible)
			               	     .map(LazyEvaluation::mapDouble)
			               	     .findFirst());
			               	   //  .orElse(0));
						
								 
    }
	public static boolean isDivisible(int i)
	{
		System.out.println("in isDivisible() "+i);
		return i%5==0;
	}
	
	public static int mapDouble(int i)
	{
		System.out.println("in mapDouble() "+i);
		return i*2;
	}
 
}
