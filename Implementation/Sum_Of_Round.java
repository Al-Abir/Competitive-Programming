package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = 1;
            ArrayList<Integer> ans = new ArrayList<>();
            int n = sc.nextInt();

            // while (n > 0) {
            //     x *= 10;
            //     int p = n % x;
            //     if (p != 0) {
            //         ans.add(p);
            //     }
            //     n -= p;
            // }
            
            while (n > 0) {
                int p = (n % 10) * x;
                if (p != 0) {
                    ans.add(p);
                }
                n /= 10;
                x *= 10;
            } 
            System.out.println(ans.size());

          
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i));
                    if (i != ans.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line for the next test case
        }
        sc.close(); // Close the scanner to avoid resource leak
    }
}
