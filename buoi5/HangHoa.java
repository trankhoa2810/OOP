package buoi5;
import java.util.Scanner;

public class HangHoa {
	private String ms, ten, noiSX;
	
	public HangHoa() {
		ms = new String();
		ten = new String();
		noiSX = new String();
	}
	
	public HangHoa(HangHoa h) {
		ms = new String(h.ms);
		ten = new String(h.ten);
		noiSX = new String(h.noiSX);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hang hoa: ");
		ms = sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.print("Nhap noi san xuat: ");
		noiSX = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ma hang hoa: " + ms);
		System.out.println("Ten hang hoa: " + ten);
		System.out.println("Noi san xuat: " + noiSX);
	}
}
