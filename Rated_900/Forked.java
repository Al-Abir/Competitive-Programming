package Rated_900;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Forked {
    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int xK = sc.nextInt();
        int yK = sc.nextInt();
        int xQ = sc.nextInt();
        int yQ = sc.nextInt();

        Set<String> kingAttacks = getKnightAttackPositions(xK, yK, a, b);
        Set<String> queenAttacks = getKnightAttackPositions(xQ, yQ, a, b);

        Set<String> intersection = new HashSet<>();
        for (String pos : kingAttacks) {
            if (queenAttacks.contains(pos)) {
                intersection.add(pos);
            }
        }
        System.out.println(intersection.size());
    }

    public static Set<String> getKnightAttackPositions(int x, int y, int a, int b) {
        Set<String> positions = new HashSet<>();
        int[] dx = { a, a, -a, -a, b, b, -b, -b };
        int[] dy = { b, -b, b, -b, a, -a, a, -a };

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            positions.add(newX + "," + newY);
        }
        return positions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}
