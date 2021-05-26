//11:Write a  program to find sum of all even and odd numbers between 1 to n. 
import java.util.Scanner;


public class Test11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n ;
        int evenSum = 0;
        int oddSum = 0;
       System.out.println("enter number");
       n=sc.nextInt();
       System.out.println("n = "+n);
       
        for (int i = 1; i <= 2 * n; i++) {
            // check even & odd using Bitwise AND operator
            if ((i & 1) == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        // Sum of even numbers less then 17
        System.out.println("Sum of First " + n
                           + " Even numbers = " + evenSum);
  
        // sum of odd numbers less then 17
        System.out.println("Sum of First " + n
                           + " Odd numbers = " + oddSum);
    }

}


