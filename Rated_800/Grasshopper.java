package Rated_800;

import java.util.Scanner;

public class Grasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int x = sc.nextInt();
            int k = sc.nextInt();

            if(x%k!=0){
                System.out.println(1);
                System.out.println(x);
            }else{
                System.out.println(2);
                System.out.print(1+ " ");
                System.out.println(x-1);
            }
            
        }
    }
}
