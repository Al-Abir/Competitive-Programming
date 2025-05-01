package Rated_800;
import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a==c &&  b==d){
                System.out.println(0);
                continue;
            }if(b>d || (c-a)>(d-b)){
                System.out.println(-1);
                continue;
            }else{
                System.out.println((a-c)+2*(d-b));
            }
            
        }
    }
}
