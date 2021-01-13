package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Integer numero, Integer agencia, Double saldo, Titular titular) {
        super(numero, agencia, saldo, titular);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

}
