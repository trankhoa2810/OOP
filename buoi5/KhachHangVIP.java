package buoi5;
import buoi2.Date;
import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tiLe;
	private Date ngayHuong;
	
	public KhachHangVIP() {
		super();
		tiLe = 0;
		ngayHuong = new Date();
	}
	
	public KhachHangVIP(KhachHangVIP k) {
		super(k);
		tiLe = k.tiLe;
		ngayHuong = new Date(k.ngayHuong);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ti le: ");
		tiLe = sc.nextFloat();
		System.out.print("Nhap ngay huong: ");
		ngayHuong.nhapNgay();
	}
	
	public void in() {
		System.out.println("Thong tin khach hang VIP: ");
		super.in();
		System.out.println("Ti le: " + tiLe);
		System.out.println("Ngay huong: " + ngayHuong);
	}
}
