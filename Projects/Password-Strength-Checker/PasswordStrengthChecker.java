import java.util.Scanner;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        System.out.print("Input Your Password : ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        int score = evaluatePassword(password);

        System.out.println("\nPassword : " + password);
        System.out.println("\nScore : " + score + "\6");

        if (score >= 5) System.out.println("Strength : STRONG");
        else if (score >= 3) System.out.println("Strength : MEDIUM");
        else System.out.println("Strength : WEAK");
    }
    static int evaluatePassword(String pw) {
        if (pw == null) pw = "";
        int score = 0;

        // Length Rule
        if (pw.length() >= 12) score += 2;
        else if (pw.length() >= 8) score += 1;

        // Character Variety
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        

        for (char c : pw.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        return score;
    }
}
