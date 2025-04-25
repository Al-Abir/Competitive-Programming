import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26]; 
            for (char curr_letter : s.toCharArray()) {
                freq[curr_letter - 'a']++;
            }

            int oddfrequency = 0;
            for (int i = 0; i < 26; i++) {
                oddfrequency += freq[i] % 2;
            }

            if (oddfrequency > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
