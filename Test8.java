//6:Write a program to find factorial of a given number.

import java.util.Scanner;


public class Test8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int i,fact=1,number;
		number=sc.nextInt();
		System.out.println("number = "+number);
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of number is : "+fact);

	}

}
