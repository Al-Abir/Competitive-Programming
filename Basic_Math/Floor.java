package Basic_Math;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            if (n <= 2) {
                System.out.println(1); 
            } else {
                int ans = (int)Math.ceil((double)(n - 2) / x) + 1;
                System.out.println(ans);
            }
        }
    }
}
