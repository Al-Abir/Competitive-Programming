package Rated_800;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {

    public static void solve(Scanner sc) {
        int len = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            b.add(sc.nextInt());
        }

        a.add(b.get(0)); 
        for (int i = 1; i < b.size(); i++) {
            if (b.get(i) >= b.get(i - 1)) {
                a.add(b.get(i));
            } else {
                a.add(b.get(i));
                a.add(b.get(i)); 
            }
        }

       
        System.out.println(a.size());
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
