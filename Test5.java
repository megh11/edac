//5:Write a program to swap two numbers.
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int A,B,t;
	System.out.println("enter numbers : ");
	A=sc.nextInt();
	System.out.println("A =" +A);
	B=sc.nextInt();
	System.out.println("B =" +B);
	
	t=A;
	A=B;
	B=t;
	System.out.println("after swapping");
	System.out.println("A =" +A);
	System.out.println("B =" +B);
	
	}

}
