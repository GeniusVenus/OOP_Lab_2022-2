package Lab01;
import java.util.*;
public class PhepToan {
    public static void main(String[] args) {
        String strNum1 , strNum2 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        strNum1 = sc.nextLine();
        System.out.print("Input the second number : ");
        strNum2 = sc.nextLine();
        double number1 = Double.parseDouble(strNum1);
        double number2 = Double.parseDouble(strNum2);
        System.out.println("Sum = " + (number1+number2));
        System.out.println("Difference = " + (number1-number2));
        System.out.println("Product = " + number1*number2);
        System.out.println("Quotient = "+ number1/number2);
    }
}