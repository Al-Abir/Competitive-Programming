package Rated_800;

import java.util.Scanner;

public class Prepend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans = n;
            int l =0; 
            int r = n-1;

           while (l<r && s.charAt(l)!=s.charAt(r)) {
                l++;
                r--;
                ans-=2;
            
           }
           System.out.println(ans);

        
        }
    }
}
