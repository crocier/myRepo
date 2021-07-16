package traning;
import java.util.Scanner;

public class Lab003level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	sumOfOdd();
		sumOfPrime();

	}
	static void sumOfOdd() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the range of Number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
		boolean res=(i%2==0)? true : false;
		if(res==false)
		sum+=i;
		}
		System.out.println("Sum of odd numbers:"+ sum);
	}
	static void sumOfPrime() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the low range of Number:");
		int n=sc.nextInt();
		System.out.println("Enter the high range of Number:");
		int m=sc.nextInt();
		int i, number, count, sum = 0;
		for(number = n; number <= m; number++)
		{
			count = 0;
			for (i = 2; i <= number/2; i++)
				{
				 if(number % i == 0)
				  {
				    count++;
				    break;
				   }
				 }
				 if(count == 0 && number != 1 )
				 {
				   sum = sum + number;
				 }  
		}
		System.out.println("\n The Sum of Prime Numbers from"+" "+n+" "+ "to"+" "+m+" "+"is:"+ sum);
	}
}

