
public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		 for(int i=1; i<=5; i++)
	        {
	              if((i%2)!= 0)
	                {
	            	  for(int j=1; j<=3; j++)
	  	            {
	  	              
	                    n=n+1;
	                    System.out.print(n);
	                }
	                }
	               
	                else
	                {
	                   int temp=n+1;
	                    for(int k=n+3;k>=temp;k--)
	                    {
	                      n=n+1;
	                      System.out.print(k);
	                    }
	                }
	                 System.out.println();
	            }
	            
	        }
	    



	}


