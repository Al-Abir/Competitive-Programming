package Rated_800;

import java.util.Scanner;

public class Blank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

       
        while (t-->0) {
            int ans =0;
            int count =0;
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<arr.length; i++){
    
                if(arr[i]!=1){
                    count++;
                    ans = Math.max(ans,count);
                }else{
                    count=0;
                }
            }
            System.out.println(ans);
            
        }
       sc.close();
    
    }
}
