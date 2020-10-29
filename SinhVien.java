package buoi3;

import buoi2.Date;
import java.util.Scanner;

public class SinhVien {
	private String MSSV, hoTen;
	private Date ngaySinh;
	private int soLuong;
	private String[] tenHP;
	private String[] Diem;
	
	public SinhVien()
	{
		MSSV = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soLuong = 0;
	}
	
	public SinhVien(SinhVien A)
	{
		MSSV = new String(A.MSSV);
		hoTen = new String(A.hoTen);
		ngaySinh = new Date(A.ngaySinh.ngay, A.ngaySinh.thang, A.ngaySinh.nam);
		soLuong = A.soLuong;
		for(int i = 0; i < soLuong; i++)
		{
			tenHP[i] = new String(A.tenHP[i]);
			Diem[i] = new String(A.Diem[i]);
		}
	}
	
	void nhapSV()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.println("Nhap Ho va Ten: ");
		hoTen = sc.nextLine();
		ngaySinh.nhapNgay();
	}
	
	void nhapDiem()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong mon hoc: ");
		soLuong = sc.nextInt();
		tenHP = new String[soLuong];
		Diem = new String[soLuong];
		sc.nextLine();
		for(int i = 0; i < soLuong; i++)
		{
			System.out.print("\tNhap ten hp thu " + (i+1) + ": ");
			tenHP[i] = sc.nextLine();
			System.out.print("\tNhap diem hoc phan thu: " + (i+1) + ": ");
			Diem[i] = sc.nextLine();
		}
	}
	
	public String toString()
	{
		return "MSSV: " + MSSV + "\nHo Ten: " + hoTen + "\nNgay Sinh: " + ngaySinh;
	}
	
	public void inSV(SinhVien A)
	{
		System.out.println("MSSV: " + A.MSSV);
		System.out.println("Ho va ten: " + A.hoTen);
		System.out.print("Ngay sinh: ");
		A.ngaySinh.in();
		System.out.println("So luong mon hoc: " + A.soLuong);
		for(int i = 0; i < A.soLuong; i++)
		{
			System.out.println("\tHoc phan thu " + (i+1) + ": " + A.tenHP[i]);
			System.out.println("\tDiem mon hoc thu " + (i+1) + ": " + A.Diem[i]);
		}
	}
}
