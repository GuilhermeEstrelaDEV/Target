import java.util.Scanner;

public class Fibonacci {

    public static boolean fibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        
        int a = 0, b = 1, next = 0;
        while (next < num) {
            next = a + b;
            a = b;
            b = next;
        }
        
        return next == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite um numero para verificar");
            int numero = scanner.nextInt();
            
            if (fibonacci(numero)) {
                System.out.println(numero + " pertence a sequencia de Fibonacci");
            } else {
                System.out.println(numero + " nao pertence a sequencia de Fibonacci");
            }

            System.out.println("Deseja verificar outro numero? (s/n)");
            continuar = scanner.next();
        }

        scanner.close();
    }
}
