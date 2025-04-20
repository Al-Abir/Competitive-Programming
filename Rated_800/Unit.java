package Rated_800;

import java.util.Scanner;

public class Unit {
    public static void slove(Scanner sc){
        int n = sc.nextInt();
        int arr[] = new int[n];
        int pos = 0;
        int neg = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        int ans=0;

        while(neg>pos){
            neg--;
            pos++;
            ans++;
        }
        if(neg%2==1){
            ans++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-->0) {
            slove(sc);
            
        }
    }
}
