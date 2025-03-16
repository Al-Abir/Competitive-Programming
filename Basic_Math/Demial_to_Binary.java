package Basic_Math;

import java.util.Scanner;


public class Demial_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int binary=0;
        int pow=0;
        while(num>0){
            int rem = num%2;
            binary = binary + (rem*(int)Math.pow(10,pow));
            pow++;
            num/=2;

        }

        System.out.println(binary);

    }
}
