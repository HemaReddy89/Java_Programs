package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Hello", "Hi", "GoodMorning", "Bye", "HelloWorld", "Hey");
		
		System.out.println(strings.stream()
                                  .count());
              

		List<String> strings1  = strings.stream()
				          .filter(string -> string.startsWith("Hello"))
				          .collect(Collectors.toList());
		System.out.println(strings);
		
	
	}

}
