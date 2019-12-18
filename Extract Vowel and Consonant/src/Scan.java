
import java.util.*;

public class Scan {

    public static void scanner() {
        Vowel v = new Vowel();
        Consonant c = new Consonant();
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a string : ");
        String s = sc.nextLine(); // Read user input
        System.out.println("Vowels in a string '" + s + "' are :");
        v.vowels(s); // send input to method

        System.out.println("Conconant in a string '" + s + "' are :");
        c.consonant(s); // send input to method
    }
}
