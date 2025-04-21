package Rated_800;

import java.util.Scanner;

public class Extremely {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            int n= sc.nextInt();
            int ans =0;
            int x=1,v=1,c=1;
            while (x<=n) {
                ans++;
                x+=v;
                if(c==9){
                    c=1;
                    v*=10;
                    x=v;
                    continue;
                }
                c++;
            
            }

            System.out.println(ans);
        }
    }
}
