

//4:Write a program to calculate power of a number.

import java.util.Scanner;
public class Test4 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int base,exponent;
		long ans = 1;
		System.out.println("enter number");
		base=sc.nextInt();
		exponent=sc.nextInt();
		System.out.println("base="+base);
		System.out.println("exponent="+exponent);
		
		while(exponent!=0) {
			ans*=base;
			--exponent;
		}
		
		System.out.println("ans is (base^exponent) : "+ans);
	}

}
