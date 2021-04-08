package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> nameStream =Stream.of("one", "two", "three", "four");
				
		nameStream.peek(e-> System.out.println("Original Element: " + e))  
		          .filter(e -> e.length() > 3)
				  .peek(e -> System.out.println("Filtered value: " + e)) // mainly to support debugging
				  .map(String::toUpperCase)
				  .peek(e -> System.out.println("Mapped value: " + e))
				  .collect(Collectors.toList());
		

        // Creating a list of Integers 
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10); 
  
        // Using peek without any terminal 
        // operation does nothing. Hence this 
        // code will produce no output. 
        list.stream().peek(System.out::println)
            .collect(Collectors.toList());

        
		
	}

}
