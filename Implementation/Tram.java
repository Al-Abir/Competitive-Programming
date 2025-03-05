package Implementation;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int value = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum = (sum+b)-a;
            value = Math.max(value,sum);

        }
        System.out.println(value);
        sc.close();
    }
}
