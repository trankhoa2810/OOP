package buoi4;
import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVienCNTT[] ds = new SinhVienCNTT[n];
		
		for(int i = 0; i < n; i++) {
			ds[i] = new SinhVienCNTT();
			System.out.println("-Sinh Vien thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		
		String emailSearch = "";
		System.out.print("Nhap email can tim: ");
		sc.nextLine();
		emailSearch = sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			if(ds[i].getEmail().equals(emailSearch))
				ds[i].in();
		}
	}
}
