package buoi4;
import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float canNang;
	
	public ConVat() {
		giong = new String();
		mau = new String();
		canNang = 0;
	}
	
	public abstract void Keu();
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("+Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("+Nhap mau long: ");
		mau = sc.nextLine();
		System.out.print("+Nhap can nang: ");
		canNang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("->Giong: " + giong);
		System.out.println("->tMau: " + mau);
		System.out.println("->tCan Nang: " + canNang);
	}
}
