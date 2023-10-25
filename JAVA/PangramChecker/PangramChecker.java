import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
