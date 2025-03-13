package Implementation;

import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int digit = a % 10;  
            int cnt = 0;
            
            while (a > 0) {
                a /= 10;
                cnt++;
            }

            if (cnt == 1) {
                System.out.println((digit * 10) - 10 + 1);
            } else if (cnt == 2) {
                System.out.println((digit * 10) - 10 + 3);
            } else if (cnt == 3) {
                System.out.println((digit * 10) - 10 + 6);
            } else if (cnt == 4) {
                System.out.println((digit * 10) - 10 + 10);
            }
        }
        sc.close();
    }
}
