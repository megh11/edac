//8:Check if number is a prime number or not.
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int num1;
		num1=sc.nextInt();
		System.out.println("num1 = "+num1);
		
		if(num1%2==0) 
			System.out.println("it is not prime number");
		
		else 
		System.out.println("it is prime number");
		
		
		
		
	}
    
}
