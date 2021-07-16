package traning;

import java.util.Arrays;
import java.util.Scanner;

public class Lab005level1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many number to store in array:");
		int N=sc.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++) {
			System.out.println("Enter the number"+" "+ (i+1));
			arr[i]=sc.nextInt();
		}
		String display= Arrays.toString(arr);
		System.out.println("Entered Array is:"+" "+ display);
		System.out.println("Enter the number you want to search:");
		int number=sc.nextInt();
		int index= linearSearch(number,arr);
		if(index == -1)
			System.out.println("Element Not found");
		else
			System.out.println("The number is at the index:"+" "+ index);
	}
	static int linearSearch(int n,int[] arr) {
		for(int i=0;i<n;i++) {
			if(arr[i]==n)
				return i;
		}
		return -1;
	}

}
