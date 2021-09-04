package buoi5;
import java.util.Scanner;

public class KhachHang {
	private String ms, ten, diaChi;
	public KhachHang() {
		ms = new String();
		ten = new String();
		diaChi = new String();
	}
	
	public KhachHang(KhachHang k) {
		ms = new String(k.ms);
		ten = new String(k.ten);
		diaChi = new String(k.diaChi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ms khach hang: ");
		ms = sc.nextLine();
		System.out.println("Nhap ten khach hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap dia chi khach hang: ");
		diaChi = sc.nextLine();
	}
	
	public void in() {
		System.out.println("->Ms khach hang: " + ms);
		System.out.println("->Ten khach hang: " + ten);
		System.out.println("->Dia chi khach hang: " + diaChi);
	}
	
	public String toString() {
		return "->Ms khach hang: " + ms + "\n->Ten khach hang: " + ten + "\n->nDia chi: " + diaChi;
	}
}
