package Implementation;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

           int t =sc.nextInt();
           while(t-->0){
              int l = sc.nextInt();
              int r = sc.nextInt();
              int d = sc.nextInt();
              int u = sc.nextInt();

              if(l==r && d==u){
                System.out.println("YES");
              }else{
                System.out.println("No");
              }
           }

           sc.close();
    }
}
