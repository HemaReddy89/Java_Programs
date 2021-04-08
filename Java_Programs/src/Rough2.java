import java.util.LinkedHashSet;

public class Rough2 {

	public static void main(String[] args) {
		
		int a=11,b=11;
		
		 System.out.println(calculate(a, b)); 
		
		
	}
		// TODO Auto-generated method stub
       public static int repeatDigit(int n)
       {
    	   LinkedHashSet<Integer> s = new LinkedHashSet<>();
    	   while(n!=0) {
    		   
    		int d=n%10;
    		   
    		   if(s.contains(d))
    		   {
    			   return 0;
    		   }
    		   
    		   s.add(d);
    		   n=n/10;
    		   
    	   }
    	   
    	   return 1;
       }
	 
       public static int calculate(int l,int r)
       {
    	 int  count=0;
    	   for(int i=l;i<=r;i++)
    	   {
    		   count=count+repeatDigit(i);
    		   
    		   if(count<1)
               {
            	   System.out.println("no unique number");
               }
        	   
    	   } 
    	 
    	   return count;
    	   
    	 
       
       }
 
}
