package Rated_800;

import java.util.Scanner;

public class Targets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
    
        while (t-- > 0) {
            char[][] arr = new char[10][10];
            int sum = 0;

            
            for (int i = 0; i < 10; i++) {
                String line = sc.next(); 
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j] == 'X') {
                        int layer = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        sum += layer + 1; 
                    }
                }
            }

            System.out.println(sum);
        }
    }
}