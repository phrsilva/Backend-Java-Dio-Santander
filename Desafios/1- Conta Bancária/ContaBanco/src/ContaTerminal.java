
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // recebendo variáveis pelo scanner 

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Informe sua agência");
        String agencia = scanner.next();

        System.out.println("Informe o saldo atual: ");
        double saldo = scanner.nextDouble();

        //retornando informações ao usuário

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta n° " + conta + " e seu saldo disponível é R$ " + saldo);

        
        
    }
}
