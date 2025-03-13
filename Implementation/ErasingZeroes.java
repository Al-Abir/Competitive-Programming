package Implementation;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading 't'

        while (t-- > 0) {
            String s = sc.nextLine();
            int firstOne = s.indexOf("1");
            int lastOne = s.lastIndexOf("1");

            if (firstOne == -1 || firstOne == lastOne) {
                System.out.println("0");
                continue;
            }

            int zeroCount = 0;
            for (int i = firstOne; i < lastOne; i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            System.out.println(zeroCount);
        }
        sc.close(); // Good practice to close Scanner
    }
}
