package Rated_900;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
         
            long n = sc.nextLong();

            if(n<4 || (n&1)==1){
                System.out.println(-1);
                continue;
            }
            long min=0;
            long max=0;
            max= n/4;
            if (n % 6 == 0) {
                min = n / 6;
            } else if (n % 6 == 2 && n >= 8) {
                min = (n - 8) / 6 + 2;
            } else if (n % 6 == 4 && n >= 4) {
                min = (n - 4) / 6 + 1;
            }
            
           System.out.println(min+" "+max);
        }
    }
}
