package buoi2;
import java.util.Scanner;

public class Diem {
	public int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	public Diem(Diem d)
	{
		x = d.x;
		y = d.y;
	}
	
	public int layX()
	{
		return x;
	}
	
	public int layY()
	{
		return y;
	}
	
	public void nhapDiem()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap hoanh do x: ");
		x = scan.nextInt();
		System.out.print("Nhap tung do y: ");
		y = scan.nextInt();
	}
	
	public void in()
	{
		System.out.print("(" + x + "," + y + ")");
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void doiDiem(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public int giaTriX()
	{
		return x;
	}
	
	public int giaTriY()
	{
		return y;
	}
	
	public float khoangCach()
	{
		float kc = (float)(Math.sqrt(x*x + y*y));
		return kc;
	}
	
	public float khoangCach(Diem d)
	{
		float kc = (float)(Math.sqrt(Math.pow((d.x - x), 2) + Math.pow(d.y - y, 2)));
		return kc;
	}
}