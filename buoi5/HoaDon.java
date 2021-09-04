package buoi5;
import buoi2.Date;
import java.util.Scanner;

public class HoaDon {
	private String ms, tenCH;
	private KhachHang k;
	private Date ngayLap;
	
	public HoaDon() {
		ms = new String();
		tenCH = new String();
		k = new KhachHang();
		ngayLap = new Date();
	}
	
	public HoaDon(HoaDon d) {
		ms = new String(d.ms);
		tenCH = new String(d.tenCH);
		k = new KhachHang(d.k);
		ngayLap = new Date(d.ngayLap);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ms cua hang: " + ms);
		ms = sc.nextLine();
		System.out.println("Nhap ten cua hang: " + tenCH);
		tenCH = sc.nextLine();
		System.out.println("Nhap thong tin khach hang:");
		k.nhap();
		System.out.println("Nhap ngay mua sp: ");
		ngayLap.nhapNgay();
	}
	
	public void in() {
		System.out.println("Ma so cua hang: " + ms);
		System.out.println("Ten cua hang: " + tenCH);
		System.out.print("Thong tin khach hang: \n" + k.toString());
		System.out.println("Ngay mua san pham: " + ngayLap.toString());
	}
	
	public String toString() {
		return "Ma so cua hang " + ms + "/nTen cua hang: " + tenCH;
	}
}
