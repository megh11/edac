import java.util.Scanner;

//14:Write a program to check entered number is Armstrong number or not.
public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no to check armstrong or not : ");
		int n,sum=0,r,temp;
		n=sc.nextInt();
		System.out.println("n : "+n);
		temp=n;
		
		while(n>0)  

		{    
		   r=n%10;    
		   sum=sum+(r*r*r);    
		   n=n/10; 
		} 
		if(temp==sum)    
			System.out.println("armstrong  number ");    
			else    
			System.out.println("not armstrong number");

	}

}
