package Rated_800;
import java.util.Scanner;

public class Twin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
         
            for(int i = 0; i < n; i++) {
                System.out.print((n - arr[i] + 1) + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
