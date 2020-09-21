import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        Factorial t = new Factorial();
        System.out.print(a + "^" + b + " = " + (t.factorial(a, b)));
    }
}

class Factorial{
    int factorial(int a, int b){
        int ans = a;
        for(int i = 2; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }
}
