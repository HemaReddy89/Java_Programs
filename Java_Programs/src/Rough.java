
public class Rough {

	public static void printArray(int[]b)
	{
		System.out.println("");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
	
	public static void swap(int []a,int i,int j)
	{
		int temp= a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void printPermutation(int []a,int pos)
	{
		if(pos == a.length-1)
		{
			printArray(a);
			return;
		}
		for(int i =pos;i< a.length;i++)
		{
			swap(a,i,pos);
			printPermutation(a,pos+1);
			swap(a,i,pos);
		}
	}
    public static void main(String[] args) {
    	int []a= {1,2,3,4};
    	printPermutation(a,0);
		
	}
	
}
