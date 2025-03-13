package Implementation;



import java.util.*;

public class Boy_Gril{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       Set<Character> st = new HashSet<>();
       
       for(int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           st.add(c);
       }
       
       if (st.size() % 2 == 0) {
           System.out.print("YES");
       } else {
           System.out.print("NO");
       }
    }
}


/*
 * import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        boolean[] seen = new boolean[26]; // Array to track character presence
        int uniqueCount = 0;

        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Convert character to index (0-25)
            if (!seen[index]) { // If character is encountered for the first time
                seen[index] = true;
                uniqueCount++;
            }
        }

        if (uniqueCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

 */