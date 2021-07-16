package traning;
import java.util.Scanner;

public class LAB003level1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int rev=reverse(num);
	DisplayInwords(rev);
	System.out.println("The reversed number is:"+ rev);
	
	}	
	public static int reverse(int n) {
		int ans=0,digit=0;
		while(n!=0) {
			digit=n%10;
			ans = ans * 10 + digit;
			n/=10;
		}
		return ans;
	}
	public static void DisplayInwords(int number) {
		while(number!=0) {
			switch(number%10) {
			case 0:
				System.out.print("zero"+" ");
				break;
			case 1:
				System.out.print("one"+" ");
				break;
			case 2:
				System.out.print("two"+" ");
				break;
			case 3:
				System.out.print("three"+" ");
				break;
			case 4:
				System.out.print("four"+" ");
				break;
			case 5:
				System.out.print("five"+" ");
				break;
			case 6:
				System.out.print("six"+" ");
				break;
			case 7:
				System.out.print("seven"+" ");
				break;
			case 8:
				System.out.print("eight"+" ");
				break;
			case 9:
				System.out.print("nine"+" ");
				break;
			}
			number/=10;
		}
		
	}
		
		
	}