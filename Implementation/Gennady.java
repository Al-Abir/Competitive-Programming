package Implementation;

import java.util.Scanner;

public class Gennady {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String table = sc.nextLine();

        String[] handcards = sc.nextLine().split(" ");

        char table1 =table.charAt(0);
        char table2 = table.charAt(1);

        boolean canPlay = false;

        for(String card : handcards){
            char handRank = card.charAt(0);
            char handSuit = card.charAt(1);
            
            if (handRank == table1 || handSuit == table2) {
                canPlay = true;
                break;
            }
        }
        if (canPlay) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
        
        
    }
}
