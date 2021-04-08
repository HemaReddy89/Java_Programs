import java.util.Scanner;

public class TCSRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      
      int a[][]=new int[n][n];
      
      for(int i=1;i<=n;i++)
    	  for(int j=1;j<=n;j++)
      {
    	  a[i][j]=sc.nextInt();
      }
      
     int sum1=0,sum2=0;
      for(int i=1;i<=n;i++)
      {
    	 sum1 += sum1+a[i][i];
    	 sum2 +=sum2+a[i][n-i-1];
      }
      
     int ans=Math.abs(sum1-sum2);
     System.out.println(ans);
      
	}

}
