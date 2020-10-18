package buoi1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        Factorial t = new Factorial();
        System.out.print(a + "^" + b + " = " + (t.factorial(a, b)));
    }
    
    int factorial(int a, int b){
        int ans = a;
        for(int i = 2; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }
}