import java.util.Scanner;

public class MockArray {
	
	
	
	
		public static void main(String []args){

		       Scanner sc = new Scanner(System.in);
		       
		       System.out.println("enter value of n");

		       int n = sc.nextInt();

		       

		       int[] arr = new int[n];

		       float max_product = 1;

		       for(int i = 0; i<n; i++)

		       {

		           arr[i] = sc.nextInt();

		       }

		       

		       for (int i = 0; i < n - 3; i++)

		           for (int j = i + 1; j < n - 2; j++)

		               for (int k = j + 1; k < n - 1; k++)

		                   for (int l = k + 1; l < n; l++)

		                       max_product = Math.min(max_product, arr[i] * arr[j] *  arr[k] * arr[l]);

		                                               

		       System.out.println(max_product);

		    

		
		
	}
		
			 
	}


