package Implementation;

import java.util.Scanner;

public class Fix_you {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            char arr[][] = new char[n][m];
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                String row = sc.next(); 
                for (int j = 0; j < m; j++) {
                    arr[i][j] = row.charAt(j); 
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == n - 1 && arr[i][j] == 'D') {
                        cnt++;
                    }
                    if (j == m - 1 && arr[i][j] == 'R') {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
