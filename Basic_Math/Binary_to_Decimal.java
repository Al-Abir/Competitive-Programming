package Basic_Math;

import java.util.Scanner;

public class Binary_to_Decimal {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dec =0;
        int pow =0;
        //111 -->7
        while (n>0) {
               int lastdigit =n%10;
               dec = dec+(lastdigit*(int)(Math.pow(2, pow)));
               pow++;
               n/=10;

        }
        System.out.println(dec);
    }
}
