package buoi2;
import java.util.Scanner;

public class Date {
	public int ngay, thang, nam;
	
	public Date(){
		ngay = 1;
		thang = 1;
		nam = 2020;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public Date(int newDay, int newMonth, int newYear) {
		ngay = newDay;
		thang = newMonth;
		nam = newYear;
	}
	
	public void in() {
		System.out.printf("%02d/%02d/%d\n", ngay, thang, nam);
	}
	
	public void nhapNgay()
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay, thang, nam sinh: ");
			ngay = sc.nextInt();
			thang = sc.nextInt();
			nam = sc.nextInt();
		}
		while(!hopLe());
	}
	
	public String toString()
	{
		return ngay + "/" +  thang + "/" + nam;
	}
	
	boolean hopLe()
	{
		if(thang > 12)
			return false;
		int day[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))
			day[2]++;
		if(ngay < 0 || ngay > day[thang] || thang < 0 || thang > 12 || nam < 0)
			return false;
		else return true;
	}
	
	Date ngayHomSau()
	{
		Date A = new Date(ngay, thang, nam);
		A.ngay++;
		if(!A.hopLe()){
			A.ngay = 1;
			A.thang++;
			if(!A.hopLe())
			{
				A.thang = 1;
				A.nam++;
			}
		}
		return A;
	}
	
	Date congNgay(int n)
	{
		Date A = new Date(ngay, thang, nam);
		for(int i = 0; i < n; i++)
		{
			A = A.ngayHomSau();
		}
		return A;
	}
	
	int soSanh(Date d)
	{
		if(nam > d.nam) return 1;
		else if(nam < d.nam) return -1;
		else {
			if(thang > d.thang) return 1;
			else if(thang < d.thang) return -1;
			else {
				if(ngay > d.ngay) return 1;
				else if(ngay < d.ngay) return -1;
				else return 0;
			}
		}
	}
}