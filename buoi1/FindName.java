package buoi1;
import java.util.Scanner;

public class FindName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		findName(str);
	}
	public static void findName(String str) {
		System.out.println(str.trim().substring(str.trim().lastIndexOf(" ")+ 1));
	}
}
