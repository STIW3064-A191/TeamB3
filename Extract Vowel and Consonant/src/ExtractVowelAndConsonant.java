
import java.util.Scanner;

public class ExtractVowelAndConsonant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String str = scan.nextLine();

        String vowels = "aeiouAEIOU";
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        System.out.print("Vowels [");

        for (char character : str.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                System.out.print(character + ",");
            }
        }
        System.out.print("]");
        
        System.out.println("");
        System.out.print("Consonant [");
        for (char character : str.toCharArray()) {
            if (consonant.indexOf(character) != -1) {
                System.out.print(character + ",");
            }
        }
        System.out.print("]");
    }
}
