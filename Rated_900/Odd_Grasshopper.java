package Rated_900;

import java.util.Scanner;

public class Odd_Grasshopper {
    public static void solve(Scanner sc){
              long x = sc.nextLong();
              long n = sc.nextLong();
              long jum = n%4;
              long totalJum = (n/4)*4;
              totalJum++;

              for(int i=1; i<=jum; i++){
                  if((x&1)==1) x+=totalJum;
                  else x-=totalJum;
                  totalJum++;
              }
              System.out.println(x);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int tt= sc.nextInt();

       while (tt-->0) {
            solve(sc);
       }
   
    }
}
