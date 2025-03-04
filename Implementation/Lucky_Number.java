package Implementation;

import java.util.Scanner;

public class Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        int luckyCount = 0;

        // Count lucky digits in the input string
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }

        // Convert luckyCount to a string and check if all characters are lucky digits (4 or 7)
        String luckyCountStr = String.valueOf(luckyCount);
        for (char c : luckyCountStr.toCharArray()) {
            if (c != '4' && c != '7') {
                System.out.println("NO");
                return;
            }
        }

        // If all characters of luckyCount are lucky digits, print "YES"
        System.out.println("YES");
    }
}
