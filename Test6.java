//7:Write a program to find m to the power n
import java.util.Scanner;


public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int base,exponent;
		long ans = 1;
		System.out.println("enter number");
		base=sc.nextInt();
		exponent=sc.nextInt();
		System.out.println("m="+base);
		System.out.println("n="+exponent);
		
		while(exponent!=0) {
			ans*=base;
			--exponent;
		}
		System.out.println("ans is (m^n) : "+ans);
	}

}
