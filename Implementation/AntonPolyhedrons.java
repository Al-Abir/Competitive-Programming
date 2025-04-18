package Implementation;

import java.util.Scanner;

public class AntonPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline after integer input
 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String polyhedron = sc.nextLine(); // Read full line for names

            switch (polyhedron) {
                case "Tetrahedron":
                    sum += 4;
                    break;
                case "Cube":
                    sum += 6;
                    break;
                case "Octahedron":
                    sum += 8;
                    break;
                case "Dodecahedron":
                    sum += 12;
                    break;
                case "Icosahedron":
                    sum += 20;
                    break;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
