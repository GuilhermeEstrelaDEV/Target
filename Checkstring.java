import java.util.Scanner;

public class Checkstring {

    public static String letra_A(String s) {
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'A') {
                a++;
            }
        }
        
        if (a > 0) {
            return "A letra 'a' aparece " + a + " vezes";
        } else {
            return "A letra 'a' não aparece";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();
        
        System.out.println(letra_A(input));

        scanner.close();
    }
}