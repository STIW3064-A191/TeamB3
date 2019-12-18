
public class Vowel {

    static void vowels(String str) { // pass string through String str
        char ch; // declare a string
        int i = 0;
        for (int j = 0; j < str.length(); j++) { //check whether the sentence consist vowel 
            ch = str.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                i = 1;
                System.out.println(ch); // print output if vowel exist
            }
        }
        if (i == 0) { // check if there are no consonant
            System.out.println("There are no vowels in a entered string"); // print output if vowel dont exist
        }
    }
}
