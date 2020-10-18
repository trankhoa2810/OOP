package buoi2;
import java.util.Scanner;


public class SDDiem {
	public static void main(String[] agrs)
	{
		Diem A = new Diem(3, 4);
		System.out.print("Toa do diem A: ");
		A.hienThi();
		Diem B = new Diem();
		System.out.print("Nhap diem B: ");
		B.nhapDiem();
		System.out.print("Toa do diem B: ");
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("Toa do diem C: ");
		C.hienThi();
		System.out.println("Khoang cach tu diem C den tam O la: " + C.khoangCach());
		System.out.println("Khoang cach tu diem A den B la: " + B.khoangCach(A));
		
		Diem ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so diem");
		int n = sc.nextInt();
		ds = new Diem[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Nhap diem thu " + (i+1) + " : ");
			ds[i] = new Diem();
			ds[i].nhapDiem();
		}
		
		for(Diem d : ds)
		{
			d.hienThi();
		}
	}
}
