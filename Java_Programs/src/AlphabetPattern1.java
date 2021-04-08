
public class AlphabetPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int c=64;
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				c=c+1;
				System.out.print((char)c);
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(char a='A';a<='D';a++)
		{
			for(char b='A';b<=a;b++)
			{
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
