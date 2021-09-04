package buoi1;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Integer.MAX_VALUE;
		long B = Integer.MAX_VALUE;
		String str = "";
		while(A == Integer.MAX_VALUE)
		{
			try {
				System.out.println("Nhap a = ");
				str = sc.nextLine();
				A = Long.parseLong(str);
			}
			catch(Exception e){
				A = Integer.MAX_VALUE;
			}
		}
		
		while(B == Integer.MAX_VALUE)
		{
			try {
				System.out.println("Nhap b = ");
				str = sc.nextLine();
				B = Long.parseLong(str);
			}
			catch(Exception e){
				B = Integer.MAX_VALUE;
			}
		}
		System.out.println(A+B);
	}
}