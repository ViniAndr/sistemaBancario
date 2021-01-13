package entities;

public class ContaPoupanca extends Conta implements Rendimentos{

    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    public double getSaldo() {
        return saldo;
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

    /*
    Metodo abstrato da interface Rendimentos
    */
    @Override
    public void atualizar(double taxaRendimento) {
        saldo += (taxaRendimento /100);
    }

    @Override
    public String toString() {
        return "Dados da Conta: \n"
                +"Numero: "
                + getNumero()
                +"\nAgencia: "
                +getAgencia()
                +"\nSaldo: "
                +getSaldo();
    }
    
    
}
