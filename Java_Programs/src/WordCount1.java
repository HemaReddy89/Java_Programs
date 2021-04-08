

import java.util.Scanner;

public class WordCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = sc.nextLine();
		System.out.println("Number of words in the String: "+countWordsUsingSplit(input));
	}
		public static int countWordsUsingSplit(String input) 
		{
			if (input == null || input.isEmpty()) 
			{ 
				return 0;
				} 
			String[] words = input.split("\\s+"); 
			return words.length; 
			
		}
		
	

}
