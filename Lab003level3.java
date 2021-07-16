package traning;
import java.util.Scanner;

public class Lab003level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int c=1;
		int i=7;
		while(true) {
		if(i%2==1 && i%3==1 && i%4==1 && i%5==1 && i%6==1)
		{
			System.out.println("The "+" "+c+" "+" mulptiple of 7 is:"+" "+i+" ");
			count++;
			c++;
			if(count==3)
				break;
				
		}
		i+=7;
		}
	}

}
