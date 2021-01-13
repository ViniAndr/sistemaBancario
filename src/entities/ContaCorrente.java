package entities;

public class ContaCorrente extends Conta {

    private Double limite = 1000.00;
    private Double taxa = 0.50;

    public ContaCorrente(Titular titular) {
        super(titular);
    }

    public double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public double getSaldoComLimite() {
        return saldo + limite;
    }

    /*
    metodo sobreposto do tipo boolean para verificar se pode sacar ou não
    (Bom que já tem a verificação, exemplo: saque so acontece se o valor for igual ou menor).
     */
    @Override
    public boolean sacar(double valor) {
        if (valor <= limite && valor <= saldo && valor > 0) {
            saldo -= (valor + taxa);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0 && valor <= limite) {
            saldo += (valor + taxa);
            return true;
        } else {
            return false;
        }
    }
}
