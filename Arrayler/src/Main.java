import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = {4,2,7,4,9,3};
        int[][] c = {{1,2},{4,5}};
        int[][] d = new int[2][2];
        arrayBastir(b);
        /*for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println(ortalama(b));*/

        sort(b);

        if(Arrays.equals(a,b))
            System.out.println("Arrayler birbirine eşit");

        else
            System.out.println("Arrayler birbirinden farklı");
    }
    public static void arrayBastir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------");
    }
    public static double ortalama(int[] ort){
        int ortalmaa = 0;
        for (int i = 0; i < ort.length; i++) {
            ortalmaa += ort[i];
        }
        return ((double)ortalmaa/ort.length);
    }

    public static void sort(int[] sort){
        Arrays.sort(sort);
        arrayBastir(sort);
    }
}
