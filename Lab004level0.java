package traning;
import java.util.Scanner;

public class Lab004level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many rows to be printed:");
		int n=sc.nextInt();
	//	pattern1A(n);
	//	pattern1B(n);
	//	pattern2A(n);
		pattern2B(n);

	}
	public static void pattern1A(int row1a) {
		for(int i=1;i<=row1a;++i) {
			for(int j=0;j<5;++j) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	public static void pattern1B(int row1b) {
		for(int i=1;i<=row1b;++i) {
			for(int j=0;j<5;++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void pattern2A(int row2a) {
		for(int i=1;i<=row2a;++i) {
			int k=1;
			for(int j=0;j<5;++j) {
				System.out.print(k);
				++k;
			}
			System.out.println("");
		}
	}
	public static void pattern2B(int row2b) {
		for(int i=1;i<=row2b;++i) {
			for(int j=0;j<i;++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
