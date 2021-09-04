package buoi2;
import java.util.Scanner;

public class PhanSo {
	 int TuSo, MauSo;
	
	public PhanSo()
	{
		TuSo = 1;
		MauSo = 1;
	}
	
	public PhanSo(int tu, int mau)
	{
		TuSo = tu;
		MauSo = mau;
	}
	
	void nhapPhanSo()
	{
		do {
			Scanner sc = new Scanner(System.in);
			TuSo = sc.nextInt();
			MauSo = sc.nextInt();
		}while(MauSo == 0);
	}
	
	void inPhanSo()
	{
		if(TuSo == 0)
			System.out.println(0);
		else if(TuSo == 1 && MauSo == 1)
			System.out.println(1);
		else if(MauSo == 1)
			System.out.println(TuSo);
		else
			System.out.println(TuSo + "/" + MauSo);
	}
	
	void nghichDao() {
		int temp = TuSo;
		TuSo = MauSo;
		MauSo = temp;
	}
	
	PhanSo tinhNghichDao()
	{
		PhanSo Temp = new PhanSo();
		Temp.TuSo = MauSo;
		Temp.MauSo = TuSo;
		return Temp;
	}
	
	float tinhSoThuc()
	{
		return TuSo / MauSo;
	}
	
	boolean lonHon(PhanSo a)
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		if(b.tinhSoThuc() > a.tinhSoThuc())
			return true;
		else return false;
	}
	
	PhanSo cong(PhanSo a)
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		b.TuSo = b.TuSo * a.MauSo + a.TuSo * b.MauSo;
		b.MauSo = b.MauSo * a.MauSo;
		b.phanSoToiGian();
		return b;
	}
	
	PhanSo tru(PhanSo a)
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		b.TuSo = b.TuSo * a.MauSo - a.TuSo * b.MauSo;
		b.MauSo = b.MauSo * a.MauSo;
		b.phanSoToiGian();
		return b;
	}
	
	PhanSo nhan(PhanSo a)
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		b.TuSo = b.TuSo * a.TuSo;
		b.MauSo = b.MauSo * a.MauSo;
		b.phanSoToiGian();
		return b;
	}
	
	PhanSo chia(PhanSo a)
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		b.TuSo = b.TuSo * a.MauSo;
		b.MauSo = b.MauSo * a.TuSo;
		b.phanSoToiGian();
		return b;
	}
	
	int GCD(int a, int b)
	{
	    a = Math.abs(a);
	    b = Math.abs(b);
	    if (b == 0)
	        return a;
	    return GCD(b, a % b);
	}
	
	PhanSo phanSoToiGian()
	{
		PhanSo b = new PhanSo(TuSo, MauSo);
		int temp = GCD(b.TuSo, b.MauSo);
		b.TuSo = b.TuSo / temp;
		b.MauSo = b.MauSo / temp;
		return b;
	}
}