package prog;
import java.util.*;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter bill amount");
		double bill= sc.nextDouble();
		System.out.println("Enter maintainance");
		double maintain= sc.nextDouble();
		System.out.println("Enter gst");
		double Gst = sc.nextDouble() ;
		double total=bill+maintain+Gst;
		double dis;
		double final_bill;
		if(bill>=1000) {
			dis=total*0.10;
			final_bill = total-dis;
			System.out.println("your bill after 10% off:");
			System.out.println(final_bill);
		}
		else {
		dis=total*0.5;
		final_bill=total-dis;
		System.out.println("your bill after 5% off:");

			System.out.println(final_bill);

		}
	}
}
