package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
	
		List<Integer> values= Arrays.asList(12,10,88,5,66);
		
		
		values.stream() 
			  .filter(i -> i%5==0)
		      .map(i -> i*i) //.forEach(System.out::println); 
			 .limit(1).forEach(System.out::println);              
				            
		                   //    .reduce(0,(c,e) -> c+e) //carry n elment
		                  //	   .reduce(0,Integer::sum));
		                  
		List<Integer> val= Arrays.asList(2,4,8,5,6,9);
	    int result =	val.stream()
		                   .reduce(0,Integer::sum);
	  System.out.println(result);
		
	}

}
