package traning;
import java.util.Scanner;

public class LAB002level1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's name:");
		String name=sc.nextLine();
		float [] marks= new float[3];
		int c;
		for(c=0;c<3;c++) {
			System.out.println(name +"'s Subject" +" "+ (c+1) +" "+ "mark:");
			marks[c]=sc.nextFloat();
		}
		float total=calculateTotal(marks);
		float avg= average(total);
		scoreLevel(marks,avg);
		
	}
	static float  calculateTotal(float arr[])
	{
		float tot=0;
		for(int i=0;i<3;i++) {
			tot+=arr[i];
		}
		System.out.println("Total marks :"+ tot);
		return tot;
	}
	static float average(float t) {
		float res=t/3;
		System.out.println("Average mark is:"+ res );
		return res;
	}
	public static void scoreLevel(float arr[],float ave) {
		if(ave>=60)
			System.out.println("Your score is 1st class");
		else if(ave>=50 && ave<60)
			System.out.println("Your score is 2nd class");
		else if(ave>=35 && ave<50)
			System.out.println("Your score is just pass");
		else
			System.out.println("Your score is fail");
			
	}
}
