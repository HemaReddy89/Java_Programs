import java.util.Scanner;

public class Diamond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of n");
		int n =sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i+j) <= 3  && ((i+j)%2)!=0 || i+j >=9 || (i>=4 && j<=2 )|| (j>=4 && i<=2)  )
				{
					System.out.print("!");
				}
				else 
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
