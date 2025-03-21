package Basic_Math;

import java.util.Scanner;

public class Collecting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

          
            int mx = Math.max(a, Math.max(b, c));

           
            int required = (mx - a) + (mx - b) + (mx - c);

            
            int remaining = n - required;
            if (remaining >= 0 && remaining % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
