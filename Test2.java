import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A,B,result;
		String X,Y,res;
		System.out.println("Enter 2 number : ");
		A=sc.nextInt();
		B=sc.nextInt();
		result=A+B;
		System.out.println("sum ="+result);
		
		System.out.println("Enter 2 char");
		X=sc.next();
		Y=sc.next();
		res=X+Y;
		System.out.println("sum ="+res);
				
	}

}
