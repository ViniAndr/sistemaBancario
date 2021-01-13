
package entities;

public class ContaCorrente extends Conta{

    private Double limite = 1000.00; //limite proposto no exercicio
    private Double taxa = 0.50; //taxa proposto no exercicio
    
    public ContaCorrente(Integer numero, Integer agencia, Double saldo, Titular titular) {
        super(numero, agencia, saldo, titular);
    }

    public Double getSaldo() {
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

    /*
    metodo sobreposto do tipo boolean para verificar se pode sacar ou não
    (Bom que já tem a verificação, exemplo: saque so acontece se o valor for igual ou menor).
    */
    @Override
    public boolean sacar(double valor) {
        if(saldo >= valor && valor <=limite){
            saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean depositar(double valor) {
        if(valor > 0 && valor <= limite){
            saldo+=valor;
            return true;
        }else{
            return false;
        }
    }
    
}
