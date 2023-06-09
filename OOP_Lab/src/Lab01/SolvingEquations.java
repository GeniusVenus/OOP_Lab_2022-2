package Lab01;
import java.util.*;
public class SolvingEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your option : ");
        int option;
        option = sc.nextInt();
        double a , b , c ;
        double a11 , a12 , b1 , a21 , a22 , b2;
        switch (option){
            case 1:
                System.out.print("Input a , b : ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                if (a == 0){
                    if (b == 0) System.out.println("Infinite Solution!");
                    else System.out.println("No Solution!");
                }
                else {
                    double res = -b / a;
                    System.out.println("The result is: x = " + res);
                }
                break;
            case 2:
                System.out.print("Input a11 , a12 , b1 : ");
                a11 = sc.nextDouble();
                a12 = sc.nextDouble();
                b1 = sc.nextDouble();
                System.out.print("Input a21 , a22 , b2 : ");
                a21 = sc.nextDouble();
                a22 = sc.nextDouble();
                b2 = sc.nextDouble();
                double Det = (a11 * a22 - a12 * a21);
                double Dx = (b1 * a22 - b2 * a12);
                double Dy = (b2 * a11 - b1 * a21);
                if (Det == 0) {
                    if ( a11 == 0 && a12 == 0 && b1 != 0) System.out.println("No solution !");
                    else if ( a21 == 0 && a22 == 0 && b2 != 0) System.out.println("No solution !");
                    else if(Dx == 0 && Dy == 0) System.out.println("Infinite solution");
                    else System.out.println("No solution !");
                }
                else {
                    double x = Dx / Det;
                    double y = Dy / Det;
                    System.out.println("Solution is: x = " + x + " y = " + y);
                }
                break;
            case 3:
                System.out.print("Input a , b , c : ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double delta = b * b - 4 * a * c;
                if (delta < 0) System.out.println("No Solution !");
                else if (delta == 0){
                    double res = -b / (2 * a);
                    System.out.println("The solution is: x =  " + res);
                }
                else {
                    double res1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double res2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("The solution is: x1 =  " + res1 + " x2 =  " + res2);
                }
                break;
            default: break;
        }
    }

}
