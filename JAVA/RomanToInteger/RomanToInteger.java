import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                result -= romanValues.get(s.charAt(i));
            } else {
                result += romanValues.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumber = scanner.nextLine().toUpperCase();
        scanner.close();

        int integerNumber = romanToInt(romanNumber);
        System.out.println(romanNumber + " = " + integerNumber);
    }
}
