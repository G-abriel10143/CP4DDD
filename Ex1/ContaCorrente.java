package Ex1;

public class ContaCorrente extends Conta {

    private double cheque;

    public double getCheque() {
        return cheque;
    }

    public void setChequeEspecial(double cheque) {
        this.chequeEspecial = cheque;
    }

    public ContaCorrente(double cheque) {
        this.cheque = cheque;
    }

    public ContaCorrente() {
    }
}
