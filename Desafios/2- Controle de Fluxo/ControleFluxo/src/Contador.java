
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite um número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parametros Invalidos! O segundo número deve ser maior que o primeiro.");
        }

        scanner.close();
    
    }

    static void contar(int numero, int numero2) throws ParametrosInvalidosException {
        
       if (numero > numero2) {
           throw new ParametrosInvalidosException();
       } else {
           for (int i = 1; numero < numero2; i++) {
               numero++;
               System.out.println("Imprimindo o numero " + i + " = " + numero);
           }
       }
     
    }

    static class ParametrosInvalidosException extends Exception {}
    
    
    
}
