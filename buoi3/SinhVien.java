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
		tenHP = new String[50];
		Diem = new String[50];
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
	
	public void nhapSV()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.print("Nhap Ho va Ten: ");
		hoTen = sc.nextLine();
		ngaySinh.nhapNgay();
	}
	
	public void nhapDiem()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong mon hoc: ");
		soLuong = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < soLuong; i++)
		{
			System.out.print("\tNhap ten hp thu " + (i+1) + ": ");
			tenHP[i] = new String();
			tenHP[i] = sc.nextLine();
			System.out.print("\tNhap diem hoc phan thu: " + (i+1) + ": ");
			Diem[i] = new String();
			Diem[i] = sc.nextLine();
		}
	}
	
	public String toString()
	{
		return "MSSV: " + MSSV + "\nHo Ten: " + hoTen + "\nNgay Sinh: " + ngaySinh;
	}
	
	public void inSV()
	{
		System.out.println("MSSV: " + MSSV);
		System.out.println("Ho va ten: " + hoTen);
		System.out.print("Ngay sinh: ");
		ngaySinh.in();
		System.out.println("So luong mon hoc: " + soLuong);
		for(int i = 0; i < soLuong; i++)
		{
			System.out.println("\tHoc phan thu " + (i+1) + ": " + tenHP[i]);
			System.out.println("\tDiem mon hoc thu " + (i+1) + ": " + Diem[i]);
		}
	}
	
	public void themHP(String ten, String d)
	{
		tenHP[soLuong] = new String(ten);
		Diem[soLuong] = new String(d);
		soLuong++;
	}
	
	public void xoaHP(String ten)
	{
		int pos = -1;
		for(int i = 0; i < soLuong; i++)
		{
			if(tenHP[i].equals(ten));
			{
				pos = i;
				break;
			}
		}
		if(pos != -1)
		{
			for(int i = 0; i < soLuong; i++)
			{
				tenHP[i] = tenHP[i+1];
				Diem[i] = Diem[i+1];
			}
		}
		soLuong--;
	}
	
	public String layTen()
	{
		String h = new String(hoTen);
		h = h.trim();
		return h.substring(h.lastIndexOf(" " + 1));
	}
	
	public float diemTB()
	{
		float d = 0;
		for(int i = 0; i < soLuong; i++)
		{
			if(Diem[i].equals("A"))
				d+=4;
			else if(Diem[i].equals("B+"))
				d+=3.5;
			else if(Diem[i].equals("B"))
				d+=3;
			else if(Diem[i].equals("C+"))
				d+=2.5;
			else if(Diem[i].equals("C"))
				d+=2;
			else if(Diem[i].equals("D+"))
				d+=1.5;
			else if(Diem[i].equals("D"))
				d+=1;	
		}
		return d/soLuong;
	}
}
