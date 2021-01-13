
package entities;

public class ContaEspecial extends ContaCorrente implements Rendimentos{
    
    public ContaEspecial(Titular titular) {
        super(titular);
    }

    //alteraçoes na taxa e no limite da conta.
    @Override
    public Double getTaxa() {
        return 0.25;
    }

    @Override
    public Double getLimite() {
        return 5000.00;
    }

    /*
    Metodo abstrato da interface Rendimentos
    */
    @Override
    public void atualizar(double taxaRendimento) {
        saldo += (taxaRendimento /100);
    }

}
