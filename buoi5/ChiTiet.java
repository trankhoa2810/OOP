package buoi5;
import java.util.Scanner;

public class ChiTiet {
	private int slg;
	private long donGia;
	private HangHoa h;
	
	public ChiTiet() {
		slg = 0;
		donGia = 0;
		h = new HangHoa();
	}
	
	public ChiTiet(ChiTiet t) {
		slg = t.slg;
		donGia = t.donGia;
		h = new HangHoa(t.h);
	}
	
	public int getSlg() {
		return slg;
	}
	
	public long getDonGia() {
		return donGia;
	}
	
	public void setSlg(int n) {
		slg = n;
	}
	
	public void setDonGia(int n) {
		donGia = n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hang hoa: ");
		slg = sc.nextInt();
		System.out.print("Nhap don gia san pham: ");
		donGia = sc.nextLong();
		System.out.print("Nhap thong tin hang hoa: ");
		h.nhap();
	}
	
	public void in() {
		System.out.println("So luong hang hoa: " + slg);
		System.out.println("Don gia: " + donGia);
		System.out.println("Thong tin hang hoa:");
		h.in();
	}
}
