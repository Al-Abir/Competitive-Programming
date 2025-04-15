package Rated_800;
import java.util.Scanner;
public class Daytona_Cost {

    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        boolean found = false;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == k){
                found = true;
            }
        }

        if(found){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            solve(sc);
        }
    }
}
