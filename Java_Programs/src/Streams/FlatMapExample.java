package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class FlatMapExample {
	
	//flatMap() is the combination of a map and a flat operation
	//i.e, it first applies map function and than flattens the result.

	public static void main(String[] args) {
		
		 // Creating a List of Strings 
        List<String> list1 = Arrays.asList("India", "China", 
                                 "France", "Germany"); 
  
        // Using Stream flatMap(Function mapper) 
        //mapping string with character at position 2
        list1.stream().flatMap(str ->  
                         Stream.of(str.charAt(2))). 
                         forEach(System.out::println); 
        
       
        // Creating a list of Prime Numbers 
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> ListofInts1 = 
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  ListofInts1); 
          
        // Using flatMap for transformating and flattening. 
        List<Integer> listofInts2  = ListofInts1.stream() 
                                    .flatMap(list -> list.stream()) 
                                    .collect(Collectors.toList()); 
  
        System.out.println("The Structure after flattening is : " + 
                                                         listofInts2); 
                                                         
	}

}
