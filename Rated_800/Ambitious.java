package Rated_800;
import java.util.Scanner;

public class Ambitious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];

        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                minOps = 0; 
            } else if (minOps != 0) {
                minOps = Math.min(minOps, Math.abs(arr[i]));
            }
        }

        System.out.println(minOps);
    }
}
