package traning;

import java.util.Arrays;
import java.util.Scanner;

public class Lab005level2 {

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
		int[] sortedarray= bubbleSort(arr,N);
		System.out.println("Enter the number you want to search:");
		int s=sc.nextInt();
		int l=0;
		int r=N-1;
        binarySearch(sortedarray,l,r,s);
		
	}
	static int[] bubbleSort(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				//swapping
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		String arrString= Arrays.toString(arr);
		System.out.println("Sorted Array is:"+" "+arrString);
		return arr;
	}

	static void binarySearch(int[] array,int l,int r,int s) {
		   int m = (l + r)/2;  
		   while( l <= r ){  
		      if ( array[m] < s ){  
		        l = m + 1;     
		      }else if ( array[m] == s ){  
		        System.out.println("Element is found at index: " + m);  
		        break;  
		      }else{  
		         r = m - 1;  
		      }  
		      m = (l + r)/2;  
		   }  
		   if ( l > r ){  
		      System.out.println("Element is not found!");  
		   }
	}
}

