package Implementation;
import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String word = sc.nextLine();
        sc.close();
        if(word.length()==0){
            return;
        }

        System.out.println(Character.toUpperCase(word.charAt(0))+ word.substring(1));
    }
}
