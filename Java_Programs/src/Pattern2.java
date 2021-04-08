
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		   
        int i,j,k,l,r=3;
        for(i=1;i<=r;i++)
        {
            for(j=r;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(l=2;l<=i;l++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
        
         for(i=1;i<=r;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=3;k>=i;k--)
            {
                 System.out.print("*");
            }
            for(l=2;l>=i;l--)
            {
                System.out.print("*"); 
            }
             System.out.println();
        }
       
		
	}

}
