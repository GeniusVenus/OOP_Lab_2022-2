package Lab01;

import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , m ;
        System.out.print("Input number of row and column : ");
        n = sc.nextInt();
        m = sc.nextInt();
        double[][] matrix1 = new double[n][m];
        double[][] matrix2 = new double[n][m];
        System.out.println("Input the first matrix : ");
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++)
                matrix1[i][j] = sc.nextDouble();
        }
        System.out.println("Input the second matrix : ");
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++)
                matrix2[i][j] = sc.nextDouble();
        }
        System.out.println("Sum = ");
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++)
                System.out.print( (matrix1[i][j] + matrix2[i][j]) +" ");
            System.out.println(" ");
        }
    }
}
