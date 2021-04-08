package Streams;

import java.util.stream.Stream;

public class StreamTerminalOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> myIntStream = Stream.of(1, 2, 3, 44, 556, -1, 0, 2234);
		System.out.println("Largest = " + myIntStream.reduce(Integer::max));
		// The below line will throw java.lang.IllegalStateException

		System.out.println("Smallest = " + myIntStream.reduce(Integer::min));

	}

}
