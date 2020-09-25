package buoi_1;
import java.util.Scanner;

public class Bai_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(checkPrime(a) == 1)
		{
			System.out.println(a + " la so nguyen to");
			System.out.println( a + " co dang nhi phan la: " + Integer.toBinaryString(a));  
		}
		else {
			System.out.println(a + " khong la so nguyen to");
		}
	}
	public static int checkPrime(int a) {
		int flag = 1;
		if(a <= 1)
			flag = 0;
		else {
			for(int i = 2; i <= (int)Math.sqrt(a); i++)
			{
				if(a % i == 0)
				{
					flag = 0;
					break;
				}
			}
		}
		return flag;
	}
}
