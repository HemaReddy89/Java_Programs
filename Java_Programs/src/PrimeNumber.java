
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0,n=6;
		
		for(i=1;i<=n;i++)
		 {
			for(int j=1;j<=i;j++)
			{
			if(n%i ==0)
			{
				count++;
			}
		}
		if(count ==2)
		{
		
			System.out.println("entered num is prime");	
		}
		else
		{
			System.out.println("number is NOT PRIME");
			
	}

}
	}
}

