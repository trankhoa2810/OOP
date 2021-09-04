package buoi4;

import buoi3.SinhVien;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(String tk, String mk, String e) {
		super();
		taikhoan = new String(tk);
		matkhau = new String(mk);
		email = new String(e);
	}
	
	public SinhVienCNTT(SinhVienCNTT A){
		super(A);
		taikhoan = new String(A.taikhoan);
		matkhau = new String(A.matkhau);
		email = new String(A.email);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapSV();
		super.nhapDiem();
		System.out.print("\tNhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.print("\tNhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.print("\tNhap email: ");
		email = sc.nextLine();
	}
	
	public void in() {
		super.inSV();
		System.out.println("\tTai khoan: " + taikhoan);
//		System.out.println("\t-Mat khau: " + matkhau);
//		System.out.println("\t-Email: " + email);
	}
	
	public String toString(){
		return super.toString() + "\nTai khoan: " + taikhoan + "\nMat khau: " + matkhau + "\nEmail: " + email;
	}
	
	public void doiMatKhau(String newPass) {
		matkhau = new String(newPass);
	}
	
	public String getEmail() {
		return email;
	}
}
