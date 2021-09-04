package buoi4;
import java.util.Scanner;

public class NongTrai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong con vat: ");
		int n = sc.nextInt();
		sc.nextLine();
		ConVat ds[] = new ConVat[n];
		String animal = "";
		for(int i = 0; i < n; i++) {
			System.out.println("-Nhap con vat thu " + (i+1) + ":");
			animal = sc.nextLine();
			if(animal.compareTo("ga") == 0 || animal.compareTo("Ga") == 0)
				ds[i] = new Ga();
			else if(animal.compareTo("bo") == 0 || animal.compareTo("Bo") == 0)
				ds[i] = new Bo();
			else if(animal.compareTo("De") == 0 || animal.compareTo("de") == 0)
				ds[i] = new De();
			
			ds[i].nhap();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("->Thong tin con vat thu " + (i+1) + ":");
			ds[i].in();
			ds[i].Keu();
		}
	}
}
