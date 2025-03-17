package Recursion;

public class Power {
    public static int powerCalulate(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        int halfpower = powerCalulate(n, pow / 2);
        int halfPowersqaure = halfpower * halfpower;

        if (pow % 2 != 0) {  // Corrected condition here
            halfPowersqaure = n * halfPowersqaure;
        }

        return halfPowersqaure;
    }

    public static void main(String[] args) {
        int n = 2;
        int pow = 5;

        System.out.println(powerCalulate(n, pow));
    }
}
