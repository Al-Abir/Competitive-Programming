package Implementation;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            k = sc.nextInt();
            arr[k] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
