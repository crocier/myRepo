package traning;
import java.util.Scanner;

public class LAB003level0 {
		public static void main(String[] args) {
		// FOR SERIES 4,16,36,64,....N
		//	series1();
		//FOR SERIES 1,2,3,4,5,6....N
		//	series2();
		//FOR SERIES 1,4,27,256,....N
	    //   series3();
		//FOR SERIES 1,4,7,12,23,42,77,....N
		//	series4();
		//FOR SERIES 1,4,9,25,36,49,81,100,....N
		//	series5();
		//FOR SERIES 1,5,13,29,49,77,.....N
			series6();
		}
		public static void series1() {
            Scanner sc = new Scanner(System.in);
	 	    System.out.println("Enter the range for series 1: ");
			int n1 = sc.nextInt();
			int j=1;
			int sum=0;
			for(int i = 1; i <= n1 ; i++) {
				sum+=j;
				j+=2;
				System.out.print(4*sum+","+" ");
				}
		}
		public  static void series2() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range for series 2: ");
			int n2 = sc.nextInt();
			for(int i = 1; i <= n2 ; i++) {
				int result= i;
				System.out.print(result+","+" " );
				}
		}
		public static void series3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range for series 3:");
			int n3 = sc.nextInt();
			for(int i = 1; i <= n3 ; i++) {
				int answer= (int) Math.pow(i, i);
				System.out.print(answer+","+" ");	
				}
		}
		public static void series4() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range for series 4: ");
			int n4 = sc.nextInt();
			int sum=0;
			int i=1;
			int j=4;
			int k=7;
			System.out.print(i +","+" "+j +","+" "+k+","+" ");
			for(int count=3;count<n4;count++) {
				sum=i+j+k;
				i=j;
				j=k;
				k=sum;
			    System.out.print(k+","+" ");
			    }
		}
		public static void series5() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range for series 5: ");
			int n5 = sc.nextInt();
			for(int i=1;i<=n5;i++) {
				if(i==4) {
					n5++;
					continue;
				}
			    System.out.print((i*i)+","+ " ");
			}
			  
			 }
		public static void series6() {
			Scanner sc = new Scanner(System.in);
			  System.out.print("Enter the range for series 6: ");
			  int n6 = sc.nextInt();
			  int i=1;
			  int j=1;
			  int c=1;
			   while(c<=n6)
			   {
			    if(j%3!=0)
			    {
			     System.out.print(i + " ");
			     i = i+4*j;
			     c++;
			    } 
			    j++; 
			   }
			 }
}
