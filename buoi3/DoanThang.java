package buoi3;
import buoi2.Diem;
import java.util.Scanner;

public class DoanThang {
	Diem d1, d2;
	
	public DoanThang()
	{
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem a, Diem b)
	{
		d1 = new Diem(a.layX(), a.layY());
		d2 = new Diem(b.layX(), b.layY());
	}
	
	public DoanThang(int ax, int ay, int bx, int by)
	{
		d1.x = ax;
		d1.y = ay;
		d2.x = bx;
		d2.y = by;
	}
	
	public void nhap()
	{
		System.out.println("Nhap diem dau:");
		d1.nhapDiem();
		System.out.println("Nhap diem cuoi:");
		d2.nhapDiem();
	}
	
	public void hienThi()
	{
		System.out.println("Hai dau mut doan thang la:");
		d1.in();
		d2.in();
	}
	
	public void tinhTien(int dx, int dy)
	{
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	public float doDaiDoanThang(Diem a, Diem b)
	{
		return a.khoangCach(b);
	}
	
	public double goc()
	{
		Diem vetor = new Diem(-d1.layX() - d2.layX(), d1.layY() - d2.layY());
		Diem H = new Diem(1,0);
		return Math.acos((vetor.giaTriX()*H.giaTriX())/(vetor.khoangCach()*H.khoangCach()) * 180 / 3.14);
	}
}
