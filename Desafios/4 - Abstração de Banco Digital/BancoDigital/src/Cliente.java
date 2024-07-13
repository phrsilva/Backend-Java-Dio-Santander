public class Cliente {

    private final String nomeCliente;
    private final String cpfCliente;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Cliente(String nomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }


    public String getCpfCliente() {
        return cpfCliente;
    }

    // set conta corrente
    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    // set conta poupanca
    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    // get conta corrente
    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    // get conta poupanca
    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cpfCliente='" + cpfCliente + '\'' +
                '}';
    }



}
