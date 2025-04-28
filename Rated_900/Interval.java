package Rated_900;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         long t = sc.nextLong();

         while(t-->0){
            long n = sc.nextLong();

            long i=1;

            while (n%i==0) {
                i++;
            }
            System.out.println(i-1);
         }
    }
}
