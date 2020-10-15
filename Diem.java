package baitap_buoi2;
import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	void nhapDiem()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap hoanh do x = ");
		x = scan.nextInt();
		y = scan.nextInt();
	}
	
	void hienThi()
	{
		System.out.println("(" + x + "," + y + ")");
	}
	
	void doiDiem(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	int giaTriX()
	{
		return x;
	}
	
	int giaTriY()
	{
		return y;
	}
	
	float khoangCach()
	{
		float kc = (float)(Math.sqrt(x*x + y*y));
		return kc;
	}
	
	float khoangCach(Diem d)
	{
		float kc = (float)(Math.sqrt(Math.pow((d.x - x), 2) + Math.pow(d.y - y, 2)));
		return kc;
	}
}
