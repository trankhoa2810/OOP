package buoi4;

import buoi2.Diem;
import java.util.Scanner;

public class DiemMau extends Diem {
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	
	public DiemMau(DiemMau dm) {
		super(dm);
		mau = new String(dm.mau);
	}
	
	public DiemMau(int x1, int y1, String m1) {
		super(x1, y1);
		mau = new String(m1);
	}
	
	public void GanMau(String m){
		mau = new String(m);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.print(", mau sac: " + mau + "\n");
	}
	
	public String toString()
	{
		return super.toString() + ", mau sac: " + mau + "\n";
	}
}
