package Rated_900;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i]= sc.nextInt();
            }
            int ans=0;
            int cons=0;
            int max = Integer.MIN_VALUE;
            Arrays.sort(arr);
            for(int i=0; i<arr.length; i++){
                cons++;
                if(i==n-1 || Math.abs(arr[i+1] - arr[i]) > k){
                    max = Math.max(max, cons);
                    cons=0;
                }
            }
            
            ans= n-max;
            System.out.println(ans);
        }
    }
}
