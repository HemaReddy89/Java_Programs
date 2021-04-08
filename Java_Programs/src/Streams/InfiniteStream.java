package Streams;


import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		
	//	Lazy execution of Streams allow stream operations to improve efficiency of execution.
		  Stream.iterate(10, n->n+2)
          .peek(num -> System.out.println("Peeked at:"+num))
          .limit(5)
          .forEach(System.out::println);
		  
		  Stream<Integer> intStream=Stream.generate(() -> 1).limit(5);
		  intStream.forEach(System.out::println);
	}

}
