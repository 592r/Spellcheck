import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Spellcheck {
    public static String check_for_word(String word) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/words"));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.indexOf(word) != -1) {
                    return "Congratulations! You have spelt '" +word+ "' correctly.";
                }
            }
            in.close();
        } catch (IOException e) {
        }
        return "Oh oh! You have spelt '" +word+ "' incorrectly.";
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String word = "";

        System.out.println("Enter a word to check ...");
        word = myScanner.nextLine();
        System.out.println(check_for_word(word));
    }
}