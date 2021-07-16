package traning;
import java.util.Scanner;

public class Lab004level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter how many rows to be printed:");
	//	int row= sc.nextInt();
	//	pattern1A(row);
	//	pattern1B(row);
		System.out.println("Enter not more than 4 digit number to display in words:");
		String num=sc.nextLine();
		displayInWords(num.toCharArray());
	//	findGrandTotal();

	}
	static void pattern1A (int row) {
		int n=1;
		for(int i=1;i<=row;i++) {
			for(int j=0;j<i;j++) {
				if(n%2==0)
					System.out.print("-" + (n*n)+" ");
				else
					System.out.print(" "+(n*n)+" ");
				n++;
				}
			System.out.println();
			}
	}

	static void pattern1B (int row) {
		int n1=1,n2=1;
		System.out.print(n1+ " ");
		System.out.println();
		for(int i=1;i<row;i++) {
			for(int j=0;j<=i;j++) {
				int tot= n1*n2;
				System.out.print(tot + " ");
				n2=tot;
				n1++;
			}
			System.out.println();
		}
	}
	static void displayInWords(char[] num) {
		int len = num.length;  
		if (len == 0)   
		{       
		System.out.println("The string is empty.");  
		return;  
		}  
		if (len > 4)   
		{  
		System.out.println("\n The given number has more than 4 digits.");  
		return;  
		}     
		String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};   
		String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};    
		String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};     
		String[] poweroftens = new String[] {"Hundred", "Thousand"};  
		System.out.print(String.valueOf(num) + ": ");  
		if (len == 1)   
		{  
		System.out.println(onedigit[num[0]-'0']);  
		return;  
		}  
		int x = 0;  
		while (x < num.length)   
		{   
		if (len >= 3)   
		{  
		if (num[x] - '0' != 0)   
		{  
		System.out.print(onedigit[num[x] - '0'] + " ");  
		System.out.print(poweroftens[len - 3]+ " ");  
		}  
		--len;  
		}  
		else   
		{      
		if (num[x] - '0' == 1)   
		{   
		int sum = num[x] - '0' + num[x + 1] - '0';  
		System.out.println(twodigits[sum]);  
		return;  
		}   
		else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
		{      
		System.out.println("Twenty");  
		return;  
		}  
		else   
		{  
		int i = (num[x] - '0');  
		if (i > 0)    
		System.out.print(multipleoftens[i]+ " ");  
		else  
		System.out.print("");   
		++x;    
		if (num[x] - '0' != 0)   
		System.out.println(onedigit[num[x] - '0']);  
		}  
		} 
		++x;  
		}  
	}
	static void findGrandTotal() {
		Scanner sc= new Scanner(System.in);
		char check;
		boolean flag=false;
		float tot=0;
		while(true){
		System.out.println("Enter the item code:");
		int code=sc.nextInt();
		System.out.println("Enter the description:");
		String d=sc.next();
		System.out.println("Enter the Quantity:");
		int qty=sc.nextInt();
		System.out.println("Enter the Price:");
		float p=sc.nextInt();
		tot+=qty*p;
		System.out.println("Want to buy new item if yes type 'y' :");
		check=sc.next().charAt(0);
	    if(check!='y')
	    	break;
		}
		//Checking if grand total is more than 10,000
		if(tot>10000)
			tot*=0.1;
		if(tot<1000) {
			float charge=(float) (tot*0.025);
			tot=tot+charge;
		}
		//DISPLAYING THE GRAND TOTAL
		System.out.println("The grand total is:"+ tot);
		String str= String.valueOf(tot);
	    displayInWords(str.toCharArray());	
		}
		
	}



