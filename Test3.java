//3:Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.
public class Test3 {
public static void main(String[] args) {
		
		int p = 20000;
				int ans=0;
		int n = 3;
		int r = 6;
		int A = p;
		
		for (int i = 1; i <= n; i++) {
			  A = A + (A*r/100);
			  ans = A-p;
			}
		System.out.println("The amount at the end of 3 years is "+A);
		System.out.println("The compound interest at the end of 3 years is "+ans);
	}

}

/*public class Test3 {

	public static void main(String[] args) {
		
		float a,p=20000,r=6,ci,n=3;
		
		a = (float) (p * (Math.pow (1+r/100, n) ));
		ci= a-p;
		System.out.println("amount = "+a);
        System.out.println("compound interest = "+ci);
	}

}
*/
