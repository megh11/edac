//palidrome no or not
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int num,rem,rev=0;
		
		System.out.println("enter number");
		num=sc.nextInt();
		System.out.println("num="+num);
		
		
        
		int t=num;
		
		while (num != 0) {
		      rem = num % 10;
		      rev = rev * 10 + rem;
		      num /= 10;
		    }
		System.out.println("reverse = "+rev);
		
		if(t==rev) {
			System.out.println("it is palidrome number");
		}
		else {
			System.out.println("it is not palidrome number");
		}
	}

}
