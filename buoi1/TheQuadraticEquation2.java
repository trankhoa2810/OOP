package buoi1;
import java.util.Scanner;

public class TheQuadraticEquation2 {
	public static void main(String[] args) {
        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        SolveEquation t = new SolveEquation();
        t.SolveTheQuadraticEquation2(a, b, c);
    }
}

