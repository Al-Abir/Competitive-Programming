package Rated_800;

import java.util.Scanner;

public class Beautiful {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // Size of array
            int[] ar = new int[n];
            
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            
            if (ar[0] == ar[n - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.print(ar[0] + " ");
                for (int i = n - 1; i > 0; i--) {
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
