package Rated_900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Divisible_25 {
    public static int min_operation(String n, String possible_value) {
        int operation = 0;
        int cheker_index = possible_value.length() - 1;

        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == possible_value.charAt(cheker_index)) {

                cheker_index--;
                if (cheker_index < 0) {
                    break;
                }
            }

            else {
                operation++;

            }

        }
        return operation;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            sc.nextLine();
            ArrayList<String> str = new ArrayList<>(Arrays.asList("00", "25", "50", "75"));

            int ans = Integer.MAX_VALUE;

            for (var possible_value : str) {

                ans = Math.min(ans, min_operation(s, possible_value));
            }
            System.out.println(ans);

        }
    }
}
