package traning;

import java.util.Scanner;

public class Lab001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	simpleInterest();
	//	swapNumbers();
	//	oddEven();
		seperateDouble();
	//	expression();
	//	decimalToBinary();
	//	binaryToDeciaml();
	//	getLcm();
	//	getPower();
	//	checkPalindrome();
		
		

	}
	static void simpleInterest() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		float p = sc.nextFloat();
		
		System.out.println("Enter the rate of interest: ");
		float r = sc.nextFloat(); 
		
		System.out.println("Enter time: ");
		float t = sc.nextFloat();
		
		float si=(p*r*t)/100;
	    System.out.println("Simple interest :" + si);
	}
	static void swapNumbers() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("swapped number1 and number2 are:"+ n1+ " " + n2);
	}
	static void oddEven(){
		//Q3 ODD OR EVEN
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String res = (n%2==0)? "even": "odd";
		System.out.println("The number is:"+ res);
	}
	static void seperateDouble(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		double num=sc.nextDouble();
		//converting double number into a string
		String str = String.valueOf(num);
		//getting the index of decimal point of a string
		int index = str.indexOf(".");
		System.out.println("Double Number: " + num);
		System.out.println("Integer Part: " + str.substring(0, index));
		System.out.println("Decimal Part: " + str.substring(index+1));
	}
	static void expression(){
		//calculating the expression
		float a=2, b=2, c=1, d=3, e=10;
		System.out.println(a+b-c*d/e);
	}
	static void decimalToBinary() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int deciNumber = sc.nextInt();
		int BinNumber = 0;
	    int count = 0;
	    while (deciNumber != 0)                          
	    {
	        int rem = deciNumber % 2;
	        double c = Math.pow(10, count);
	        BinNumber += rem * c;
	        deciNumber /= 2;
	 
	        // Count used to store exponent value
	        count++;
	    }
	    System.out.println(BinNumber);
	}
	static void binaryToDeciaml() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		int bin = sc.nextInt();
		int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(bin == 0){  
	        break;  
	      } else {  
	          int temp = bin%10;  
	          decimal += temp*Math.pow(2, n);  
	          bin = bin/10;  
	          n++;  
	       }  
	    }
	    System.out.println(decimal);
	}
	static void getLcm() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers to find LCM:");
		int N = sc.nextInt();
		int[] array= new int[N];
		for (int i=0;i<N;i++) {
			System.out.println("Enter number "+ (i+1));
			array[i]=sc.nextInt(); 
		   }
		int lcm = array[0];
	    int gcd = array[0];
	 
	    //loop through the array to find GCD
	    //use GCD to find the LCM
	    for(int i=1; i<array.length; i++){
	      gcd = findGCD(array[i], lcm);
	      lcm = (lcm*array[i])/gcd;
	    }
	    System.out.println("LCM: "+lcm);
	  }
	 
	  //recursive function to find GCD of two numbers
	  public static int findGCD(int a, int b){
	    if(b == 0)
	      return a;
	    return findGCD(b, a%b);
	  }

	//getting power
	static void getPower() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base:");
		int b = sc.nextInt();
		
		System.out.println("Enter the power:");
		int p = sc.nextInt();
		int res = 1;
		for (int i=1;i<=p;i++) {
			res=res*b;
		}
		System.out.println("The result is:" + res);
	}
	static void checkPalindrome() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		boolean flag=true;
		int i=0;
		int j= str.length()-1;
		if (str.charAt(i)!=str.charAt(j)) {
			flag= false;
			}
		i++;
		j--;
		System.out.println((flag==true)?"Is a palindrome":"Not a palindrome");
	}
}
	
