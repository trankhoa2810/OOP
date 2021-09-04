package buoi1;

public class SolveEquation {
	void SolveTheQuadraticEquation1(float a, float b){
        if(a == 0 && b != 0)
            System.out.print("Phuong trinh vo nghiem");
        else if(a == 0 && b == 0)
            System.out.print("Phuong trinh vo so nghiem");
        else System.out.print("Nghiem cua phuong trinh la: x = " + (-b/a));
    }
    void SolveTheQuadraticEquation2(float a, float b, float c){
        if(a == 0)
            SolveTheQuadraticEquation1(b, c);
        else{
            float delta = b * b - 4 * a * c;
            float x1 = (float)(-b + Math.sqrt(delta)) / 2 * a;
            float x2 = (float)(-b - Math.sqrt(delta)) / 2 * a;
            if(delta == 0)
                System.out.print("Phuong trinh co nghiem kep x1 = x2 = " + x1 );
            else if(delta > 0)
                System.out.print("Phuong tirnh co 2 nghiem phan biet:\nx1 = " + x1 + "\nx2 = " + x2);
            else
                System.out.print("Phuong trinh vo nghiem");
        }
    }
}
