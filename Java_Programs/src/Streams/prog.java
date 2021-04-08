package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values= new ArrayList<Integer>();
		for(int i=1;i<10;i++)
		{
			values.add(i);
		
		}
	//	values.forEach(System.out::println);  //Method Reference ,forEach method
	//	values.forEach(i -> System.out.println(i)); 
		List<Integer>val= values.stream()
			                 	.collect(Collectors.toList()); //we can only reuse a collection 
				            //   .forEach(System.out::println);
		System.out.println(val);
		List<Integer> square1 = val.stream()
                                   .map(x -> x*x)
                                   .collect(Collectors.toList()); 
        System.out.println(square1); 

        List<Integer> square2 = square1.stream()
                                   .map(x -> x*x)
                                   .collect(Collectors.toList());
                                 
        System.out.println(square2); 
		
//		values.stream()
//              .filter(i -> {System.out.println("hi");
//			return true;
//		}).findFirst();
		
	}

}
