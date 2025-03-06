package Implementation;

import java.util.Scanner;

public class Bear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt=0;
        for(int i=1; i<=10; i++){
            a*=3;
            b*=2;
            cnt++;
            if(a>b){
                System.out.println(cnt);
                break;
            }

        }
    }
}
