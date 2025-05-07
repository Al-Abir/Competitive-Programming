package Rated_900;

import java.util.Scanner;

public class Not_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] =sc.nextInt();
            }
           
            for(int i=0; i<arr.length; i++){
                if(arr[i]==1) arr[i]++;
            }
            for(int i=0; i<arr.length-1; i++){
                  if(arr[i+1]%arr[i]==0) arr[i+1]++;
            }
            for(int num: arr){
                System.out.print(num+" ");
            }
        }
        sc.close();
    }
}
