package Pattern;

public class Half {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Printing first half stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            
            // Printing spaces
            for (int space = 1; space <= 2 * (i - 1); space++) {
                System.out.print(" ");
            }
            
            // Printing second half stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
