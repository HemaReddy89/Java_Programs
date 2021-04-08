package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5,9,3); 
	    
	    // demonstration of filter method 
	    List<Integer> even= number.stream()
		                          .filter(x->x%2==0)
		                          . collect(Collectors.toList()); 
        System.out.println(even); 
  
	
	    // demonstration of map method 
	    List<Integer> square1 = number.stream()
	    		                      .map(x -> x*x)
                                     . collect(Collectors.toList()); 
        System.out.println(square1); 
        
        List<Integer> square2 = square1.stream()
                                      .map(x -> x*x)
                                      . collect(Collectors.toList()); 
          System.out.println(square2); 
		      
                
		      
/*		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 15, 66, 8, 9, 23);
		numbers.stream()
		
		 //    .limit(4).forEach(System.out::println);
		 //  .skip(4).forEach(System.out::println);
		   .sorted()//.forEach(System.out::println)
		   .distinct().forEach(System.out::println) ;  //remove duplicates
	*/	
		
	
	}

}
