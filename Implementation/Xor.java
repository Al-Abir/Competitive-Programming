package Implementation;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
               int n = sc.nextInt();

               int temp =n;
               int cnt =0;
               while (temp>0) {
                   temp>>=1;
                   cnt++;
               }
              
             int ans=(n^cnt);
             if(ans==0){
                System.out.println("-1");
             }else{
                System.out.println(ans);
             }

        }
    }
}
