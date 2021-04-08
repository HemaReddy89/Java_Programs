import java.util.Scanner;

public class Permutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABC";
		
		printPermutation(str,0);
		
	}
	public static String swap(String s,int i,int j)
	{
		char []b= s.toCharArray();
		char temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		return String.valueOf(b);
	}
	public static void printPermutation(String str,int pos)
	{
		int count=0;
		if(pos == str.length()-1) {
			
			System.out.println(str);
			
			
		}

		for(int i=pos;i<str.length();i++)
		{
			str=swap(str,i,pos);
			printPermutation(str,pos+1);
			str=swap(str,i,pos);
		
		}
		
	}
	

}
