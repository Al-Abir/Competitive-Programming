package Rated_800;

import java.util.Scanner;

public class Coloring {

    public static void solve(int arr[]){
           int sum1 =0;
            int sum2=0;

            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0){
                    sum1+=arr[i];
                }else{
                    sum2+=arr[i];
                }
            }

            if(sum1%2==0 && sum2%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i =0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            solve(arr);
        }
    }
    
}
