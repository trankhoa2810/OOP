package buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hop gach: ");
		int n = sc.nextInt();
		Gach ds[];
		ds = new Gach[n];
		
		for(int i = 0; i < n; i++)
		{
			ds[i] = new Gach();
			System.out.println("-Hop gach thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("+)Thong tin hop gach thu " + (i+1) + " : ");
			ds[i].in();
		}
		
		long chiPhiMin = ds[0].soLuongHop(2000, 500) * ds[0].layGia();
		int msTemp = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(chiPhiMin > ds[i].soLuongHop(2000, 500) * ds[i].layGia())
				msTemp = i;
		}
		
		System.out.print("->Loai gach co chi phi thap nhat la: ");
		ds[msTemp].in();
		
		long chiPhi = 0;
		for(int i = 0; i < n; i++)
		{
			chiPhi = ds[i].soLuongHop(2000, 500) * ds[i].layGia();
			System.out.println("=>Chi phi lot cua loai gach thu " + (i+1) + "la: " + chiPhi);
		}
	}
}
