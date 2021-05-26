//12: Write a  program to enter a number and print its reverse.

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		
		int num,rem,rev=0;
		
		System.out.println("enter number");
		num=sc.nextInt();
		System.out.println("num="+num);
		
		while (num != 0) {
		      rem = num % 10;
		      rev = rev * 10 + rem;
		      num /= 10;
		    }
		System.out.println("reverse = "+rev);
	}

}
