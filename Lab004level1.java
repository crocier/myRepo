package traning;
import java.util.Scanner;

public class Lab004level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Accepting the row value
		System.out.println("Enter how many rows to be printed:");
		int num=sc.nextInt();
	//	pattern1A(num);
	//	pattern1B(num);
	//	pattern2A(num);
	//	pattern2B(num);
	//	pattern3A(num);
		pattern3B(num);
		sc.close();

	}
	public static void pattern1A(int row1a) {
		for (int i=0; i<row1a; i++)   
		{     
		for (int j=2*(row1a-i); j>=0; j--)         
		{       
		System.out.print(" ");   
		}    
		for (int j=0; j<=i; j++ )   
		{     
		System.out.print("* ");   
		}    
		System.out.println();   
		}   
}
	public static void pattern1B(int row1b) {
		for (int i=0; i<row1b; i++)   
		{        
		for (int j=row1b-i; j>1; j--)   
		{    
		System.out.print(" ");   
		}     
		for (int j=0; j<=i; j++ )   
		{   
		System.out.print("* ");   
		}     
		System.out.println();   
		}   
}   
	public static void pattern2A(int row2a) {
		for(int i=1;i<=row2a;++i) {
			for(int j=0;j<i;++j) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	public static void pattern2B(int row2b) {
		for(int i=1;i<=row2b;++i) {
			int k=1;
			for(int j=0;j<i;++j) {
				System.out.print(k);
				++k;
			}
			System.out.println(" ");
		}
	}
	public static void pattern3A(int row3a) {
		int k=1;
		for(int i=1;i<=row3a;++i) {
			for(int j=0;j<i;++j) {
				System.out.print(k+" ");
				++k;
			}
			System.out.println("");
		}
	}
	/*1
	 * 1 2
	 * 3 5 8
	 * 
	 */
	public static void fib(int f[], int N) {
		f[1] = 1;
		f[2] = 1;
		
		for (int i = 3; i <= N; i++)
			f[i] = f[i - 1] + f[i - 2];
	}
	public static void pattern3B(int row3b)
	{
		int N = row3b * (row3b + 1) / 2;
		int f[]=new int[N + 1];
		fib(f, N);
		int count = 1;

		for (int i = 1; i <= row3b; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print(f[count++] + " ");
				
			System.out.println();
		}
	}
		
	}

