public abstract class Conta {

   private static int SEQUENCIAL = 0; 

   double saldo = 0;
   Agencia agencia;
   Cliente cliente; 
   int numConta = 0;


    public Conta(Agencia agencia, Cliente cliente) {
        SEQUENCIAL++;
        this.agencia = agencia;
        this.cliente = cliente;
        this.numConta = SEQUENCIAL;
    }

    public void deposito(double valor) {
        saldo += valor;
    };

    public void saque(double valor) {
        saldo -= valor;

    }

    public void transferencia(double valor, Conta contaDestino) {
        saque(valor);
        contaDestino.deposito(valor);
        
    }
    
    // get saldo
    public double getSaldo() {
        return saldo;
    }

    // to string

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                ", numConta=" + numConta +
                '}';
    }

}

