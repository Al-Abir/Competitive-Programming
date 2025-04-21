package Rated_800;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int xorSum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                xorSum ^= arr[i];
            }

            if (n % 2 == 0) {
                if (xorSum == 0) {
                    System.out.println(0); 
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(xorSum); 
            }
        }

        sc.close();
    }
}
