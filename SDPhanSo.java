package buoi2;
import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] agrs)
	{
		PhanSo a = new PhanSo(3, 7);
		a.inPhanSo();
		PhanSo b = new PhanSo(4, 9);
		b.inPhanSo();
		PhanSo x, y;
		x = new PhanSo();
		x.nhapPhanSo();
		y = new PhanSo();
		y.nhapPhanSo();
		x.tinhNghichDao().inPhanSo();
		x.cong(y).inPhanSo();
		
		PhanSo ds[];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new PhanSo[n];
		
		for(int i = 0; i < n; i++)
		{
			ds[i].TuSo = sc.nextInt();
			ds[i].MauSo = sc.nextInt();
		}
		
		
		
		for(int i = 0; i < n; i++)
		{
			
		}
		
	}
}
