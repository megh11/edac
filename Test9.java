//9:Sum of series :1+2+3+….+n

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter nth number : ");
		
		int n,i,sum=0;
		
		
		n=sc.nextInt();
		System.out.println("nth term = "+n);
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		
		System.out.println("sum of first n numbers = "+sum);
	}

}
