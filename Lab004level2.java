package traning;
import java.util.Scanner;

public class Lab004level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Accepting the  value
	//	System.out.println("Enter the Number to find factorial:");
	//	int num= sc.nextInt();
		//Checking the number is greater than 0
	//	while(num<0) {
	//		System.out.println("Please enter the number greater than 0:");
	//		num= sc.nextInt();
	//	}
	//	int fact=factorial(num);
	//	System.out.println("Factorial of"+num+ "is:"+ fact);
		
		//1,2,6,15,31,56,.......N
	//	System.out.println("Enter the range to print series 2a:");
	//	int n2a=sc.nextInt();
	///	series2A(n2a);
	//	System.out.println("Enter the range to print series 2b:");
	//	int n2b=sc.nextInt();
	//	series2B(n2b);
		System.out.println("Enter the range to print series 3a:");
		int n3a=sc.nextInt();
		series3A(n3a);
	//	System.out.println("Enter the range to print series 3b:");
	//	int n3b=sc.nextInt();
	//	series3B(n3b);
	//	System.out.println("Enter the number to check if it is fibonacci or not:");
	//	int n=sc.nextInt();
	//	checkFibonacci(n);

	}
	static int factorial(int n) {
		if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));
	}
	static void series2A(int n2a) {
		//1,2,6,15,31,.....
		int n1=1,n2;
		for(int i=0;i<n2a;i++) {
			n2=n1+i*i;
			n1=n2;
			
			System.out.print(n2+ " ");
		}
	}
	static void series2B(int n2b) {
		//1,1,2,3,5,8,...
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n2+" ");
		for(int i=1;i<n2b;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}
	static void series3A(int n3a) {
		//1,2,4,6,7,10,10,14,....
		int n1=1;
		int a=2;
		int count=0;
		System.out.print(n1+" "+a+" ");
		int i=3;
		int j=4;
		boolean check=(n3a%2==0)?true:false;
		if(check)
		    count=3;
		else
			count=4;
		while(count<=n3a) {
			int n2=n1+i;
			n1=n2;
			System.out.print(n2+" ");
			int b=a+j;
			a=b;
			System.out.print(b+" ");
			count+=2;	
		}
		if(check==false) {
			int n2=n1+i;
			n1=n2;
			System.out.print(n2+" ");
		}
			
	}
	static void series3B(int n3b) {
		//1,5,8,14,27,49,.....N
		int n1=1;
		int n2=5;
		int n3=8;
		int sum=0;
		System.out.print(n1+" "+n2+" "+n3+" ");
		for(int i=4;i<=n3b;i++) {
			sum=n1+n2+n3;
			n1=n2;
			n2=n3;
			n3=sum;
			System.out.print(n3+" ");
		}
	}
	static void checkFibonacci(int n) {
		//using formula method
		int a= 5*(n*n)-4;
		int b= 5*(n*n)+4;
		int n1= (int)Math.sqrt(a);
		int n2= (int)Math.sqrt(b);
		if((n1*n1)==a || (n2*n2)==b)
			System.out.println("The number is Fibonacci number");
		else
			System.out.println("The number is NOT a Fibonacci number");
	}
}

