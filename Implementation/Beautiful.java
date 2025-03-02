package Implementation;

import java.util.Scanner;

public class Beautiful {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;  
        int cnt = 0;
        int matrix[][] = new int[N][N];


        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 1) {
                    int var = i;
                    int var2 = j;

                  
                    while (var != 2 || var2 != 2) {
                        if (var > 2) {
                            var--;
                            cnt++;
                        } else if (var < 2) {
                            var++;
                            cnt++;
                        }

                        if (var2 > 2) {
                            var2--;
                            cnt++;
                        } else if (var2 < 2) {
                            var2++;
                            cnt++;
                        }
                    }
                }
            }
        }

        sc.close();
        System.out.println(cnt);
    }
}
