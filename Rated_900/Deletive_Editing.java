package Rated_900;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deletive_Editing {
    public static void solve(Scanner sc) {
        String s = sc.next();
        String t = sc.next();
        sc.nextLine();

        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(26, 0));

        // Count characters in t
        for (char ch : t.toCharArray()) {
            list.set(ch - 'A', list.get(ch - 'A') + 1);
        }

        StringBuilder temp = new StringBuilder();

        // Traverse s from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (list.get(ch - 'A') > 0) {
                temp.append(ch);
                list.set(ch - 'A', list.get(ch - 'A') - 1);
            }
        }

        temp.reverse();

        if (temp.toString().equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            solve(sc);
        }
    }
}




/*
 
 int[] freq = new int[26];  // Frequency array for letters A-Z

        // Count frequencies in t
        for (char ch : t.toCharArray()) {
            freq[ch - 'A']++;
        }

        StringBuilder temp = new StringBuilder();

        // Traverse s in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (freq[ch - 'A'] > 0) {
                temp.append(ch);
                freq[ch - 'A']--;
            }
        }

        temp.reverse();

        if (temp.toString().equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

 */