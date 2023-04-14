package Lab01;
import java.util.*;
public class ArrayProcessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input n : ");
        n = sc.nextInt();
        double[] array = new double[n];
        System.out.print("Input array : ");
        double sum = 0;
        for(int i = 0 ; i < n ; i++) {
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        for(int i = 0 ; i < n-1; i++){
            for(int j = i+1 ; j < n ; j++){
                if(array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sum = " + sum);
        System.out.println("Average value = " + sum / n);
    }
}
