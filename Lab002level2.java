package traning;
import java.util.Scanner;

public class Lab002level2 {

	public static void main(String[] args) {
		// vendor offers software services to the client
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vendor service rate per hour:");
		float vendorrate=sc.nextFloat();
		System.out.println(" vendors chooses what options:press 1.purchased software/hardware,"
				             + "2.used external consultants ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("dollor rate per hour for software/hardware purchase:");
			float purchaserate=sc.nextFloat();
			vendorClient(vendorrate,purchaserate);
			
		}
		else {
			System.out.println("dollor rate per hour for external consultants:");
			float consultantrate=sc.nextFloat();
			vendorClient(vendorrate,consultantrate);
		}
		
	}
	static void vendorClient(float vrate,float prate)
	{
		float amt = 0;
		float vendoramt;
		Scanner sc = new Scanner(System.in);
		System.out.println("vendor provide how many hours of service to the client:");
		float hours=sc.nextFloat();
		vendoramt=prate*hours;
		System.out.println("vendor uses client's: press 1 for software/hardware, "
				+ " 2 for licenses, 3 for commonly available");
		int check=sc.nextInt();
		if(check==1) {
			amt=(float) (vrate*hours-(vrate*hours*0.3));
		}
		else if(check==2) {
			amt=(float) (vrate*hours-(vrate*hours*0.5));
		}
		else if(check==3) {
			amt=vrate*hours;
		}
		else
			System.out.println("entered number is not accepted");
		if(amt>=vendoramt)
			System.out.println("vendor has profit of:"+ (amt-vendoramt)+ "dollars");
		else if(amt<vendoramt)
			System.out.println("vendor has loss of:"+ (vendoramt-amt)+"dollars");
	}

}
