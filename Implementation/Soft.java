package Implementation;

import java.util.Scanner;

public class Soft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //  n, k, l, c, d, p, nl, np;
       int n = sc.nextInt();
       int k =sc.nextInt();
       int l =sc.nextInt();
       int c =sc.nextInt();
       int d =sc.nextInt();
       int p =sc.nextInt();
       int nl=sc.nextInt();
       int np=sc.nextInt();
       sc.close();

       int Drink = (k * l) / nl;
       int  lims = c*d;
       int salt = p/np;

       int ans = Math.min(Drink , Math.min(lims,salt))/n;
       
       System.out.println(ans);
    }
}
