import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		if(n % 2 ==0)
		{
		for(int i=1;i<=(n-2);i=i+2)
		{
			a=a+2;
			b=a/2;
		}
		System.out.println(n+" element of the series is ="+b);
		} else {
			for(int i=1;i<(n-2);i=i+2)
			{
				a=a+2;
				b=a/2;
			}
		}
	}

}
