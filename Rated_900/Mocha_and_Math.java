package Rated_900;

import java.util.Scanner;

public class Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-->0) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                 arr[i]= sc.nextInt();
            }
            int ans = arr[0];

            for(int i=1; i<arr.length; i++){
                  ans = ans & arr[i];
            }

            System.out.println(ans);
            
         }
    }
    
}
