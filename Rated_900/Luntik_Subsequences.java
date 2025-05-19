package Rated_900;

import java.util.Scanner;

public class Luntik_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long[] po = new long[61];
        po[0] = 1;
        for (int i = 1; i <= 60; i++) {
            po[i] = po[i - 1] * 2;
        }

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of elements in the array
            long c1 = 0, c2 = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) {
                    c1++;
                } else if (x == 0) {
                    c2++;
                }
            }

            long ans = po[(int)c2] * c1;
            System.out.println(ans);
        }

        sc.close();
    }
    
}
