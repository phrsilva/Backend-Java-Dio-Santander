import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private final int numAgencia;
    List<Cliente> clientes = new ArrayList<>();
    List<Conta> contas = new ArrayList<>();


// construtor 
    public Agencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public void criarContaCorrente(Cliente cliente) {

        ContaCorrente contaCorrente = new ContaCorrente(this, cliente);
        contas.add(contaCorrente);
        cliente.setContaCorrente(contaCorrente);
        
    }

    public void criarContaPoupanca(Cliente cliente) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(this, cliente);
        contas.add(contaPoupanca);
        cliente.setContaPoupanca(contaPoupanca);

    }
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    
    }

    // to string
    @Override
    public String toString() {
        return "Agencia{" +
                "numAgencia=" + numAgencia +
                ", clientes=" + clientes +
                ", contas=" + contas +
                '}';
    }
}
