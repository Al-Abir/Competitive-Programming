package Rated_900;

import java.util.Scanner;

public class Universe {
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }

        int left =0;
        int right = n-1;
        boolean found_zero= false;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) count++;
        }

        while(left < n && arr[left]==0){
             left++;
        }
        while (right>=0 && arr[right]==0) {
            right--;
            
        }
        for(int i=left; i<=right; i++){

            if(arr[i]==0){
                found_zero=true;
            }
        }

        if(count==n){
            System.out.println(0);
        }else if(found_zero==false){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            solve(sc);
        }
    }
}
