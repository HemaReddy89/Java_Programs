

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        int s=0,a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of numbers");	   
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter "+n+" numbers ");
           for(int i=0;i<n;i++)
           {      
        	   	  System.out.println("enter  number  "+(i+1)+":");
                  a[i]=sc.nextInt();
            }
         s=AddNumber.sumofnum(a,n-1,s);	    
         System.out.println("Addition of these numbers = "+s);          
    	}
	static int sumofnum(int a[],int n,int s1)
	{
    if(n<0)
    return s1;
    else
   {
     s1+=a[n];
    
     return AddNumber.sumofnum(a,n-1,s1);
  }
}


	

}
