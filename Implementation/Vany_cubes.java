package Implementation;

import java.util.Scanner;

public class Vany_cubes {
    public static int sum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level =0;
         int cnt =0;
        int n = sc.nextInt();
        
        while(true){
            n-=sum(level+1);
            level++;
            if(n>=0) cnt++;
            else break;

        }

        System.out.println(cnt);
        
    }
}
