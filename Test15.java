//15:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num : ");
		int num1,num2,num3;
		num1=sc.nextInt();
		System.out.println("num1 ="+num1);
		num2=sc.nextInt();
		System.out.println("num2 ="+num2);
		num3=sc.nextInt();
		System.out.println("num3 ="+num3);
		
		
		if(num1>=num2) {
			if(num1>=num3) {
				System.out.println("num 1 is greatest");
			}
		}else 
		{
			if(num2>num3) 
				System.out.println("num 2 is greatest");
			
		
		else
		{	System.out.println("num 3 is greatest");
		
		}
		  }
		

	}

}
