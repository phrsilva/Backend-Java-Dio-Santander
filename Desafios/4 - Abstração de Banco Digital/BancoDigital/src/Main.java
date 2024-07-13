
public class Main {
    public static void main(String[] args) {
      Agencia agencia = new Agencia(1);
      Cliente cliente = new Cliente("João", "123.456.789-00");
      
      agencia.cadastrarCliente(cliente);
      agencia.criarContaCorrente(cliente);
      agencia.criarContaPoupanca(cliente);   

      cliente.getContaCorrente().deposito(1000);
      cliente.getContaPoupanca().deposito(2000);

      cliente.getContaCorrente().saque(500);
      cliente.getContaPoupanca().saque(3000);

      System.out.println(cliente.getContaCorrente().getSaldo());
      System.out.println(cliente.getContaPoupanca().getSaldo());

      System.out.println(agencia);

    }

    
}

