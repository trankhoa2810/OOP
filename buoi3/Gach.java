package buoi3;
import java.util.Scanner;

public class Gach {
	private String ms;
	private String mau;
	private int sl;
	private int dai, ngang;
	private long gia;
	
	public Gach()
	{
		ms = new String();
		mau = new String();
		sl = 0;
		dai = 0;
		ngang = 0;
		gia = 0;
	}
	
	public Gach(String ms1, String mau1, int sl1, int D, int N, long gia1)
	{
		ms = new String(ms1);
		mau = new String(mau1);
		sl = sl1;
		dai = D;
		ngang = N;
		gia = gia1;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\t+Nhap ms hop gach: ");
		ms = sc.nextLine();
		System.out.print("\t+Nhap mau sac hop gach: ");
		mau = sc.nextLine();
		System.out.print("\t+Nhap so luong vien gach trong hop: ");
		sl = sc.nextInt();
		System.out.print("\t+Nhap chieu dai: ");
		dai = sc.nextInt();
		System.out.print("\t+Nhap chieu ngang: ");
		ngang = sc.nextInt();
		System.out.print("\t+Nhap gia tien hop gach: ");
		gia = sc.nextLong();
	}
	
	public void in()
	{
		System.out.println(ms + ", " + mau + ", " + dai + ", " + ngang + ", " + gia);
	}
	
	public float giaBanLe()
	{
		return (float)(gia * sl * 1.2);
	}
	
	public int dienTichToiThieu()
	{
		return dai * ngang;
	}
	
	public long layGia()
	{
		return gia;
	}
	
	public int layDai()
	{
		return dai;
	}
	
	public int layNgang()
	{
		return ngang;
	}
	
	public int soLuongHop(int D, int N)
	{
		int slNgang = N / ngang;
		if(slNgang % 1 != 0)
			slNgang++;
		int slDoc = D / dai;
		if(slDoc % 1 != 0)
			slDoc++;
		return (slNgang * slDoc);
	}
}
