package buoi3;
import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args)
	{
		SinhVien a = new SinhVien();
		a.nhapSV();
		a.nhapDiem();
		a.themHP("LTHDT", "A");
		a.xoaHP("LTHTD");
		a.inSV();
		System.out.println("->Diem trung binh mon: " + a.diemTB());
		
		SinhVien ds[];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Nhap so luong SV: ");
		n = sc.nextInt();
		sc.nextLine();
		ds = new SinhVien[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("+Nhap SV thu " + (i+1) + ": ");
			ds[i] = new SinhVien();
			ds[i].nhapSV();
			ds[i].nhapDiem();
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("+Thong tin SV thu " + (i+1) + ": ");
			ds[i].inSV();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(ds[i].diemTB() < 1)
				System.out.println(ds[i]);
		}
	}
}
