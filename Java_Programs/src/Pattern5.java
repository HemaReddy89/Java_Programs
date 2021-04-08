import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k,l;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of n");
		int n =sc.nextInt();
		

		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=(n-3);l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println("-------------");
		for(i=1;i<=n;i++)
		{
		  for(j=0;j<=i;j++)
		  {
			  System.out.print(" "); 
		  }
		  for(k=n-1;k>=i;k--)
		  {
			  System.out.print("*");
		  }
		  for(l=(n-2);l>=i;l--)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		}
	}

}
