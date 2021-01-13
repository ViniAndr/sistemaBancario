
package entities;

public abstract class Conta{
    private Integer numero;
    private Integer agencia;
    protected Double saldo;
    
    private Titular titular;
    /*
    Constructor com parametros numeor da conta, agencia, saldo(Apenas para teste),
    Titular, que recebe por parametro(Nome, Email, Enderenço).
    */
    public Conta(Integer numero, Integer agencia, Double saldo, Titular titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    
    
    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    /*
    Metodos abstratos para serem implementados logica nas class dos tipos
    de contas.
    */
    public abstract boolean sacar (double valor);
    
    public abstract  boolean depositar (double valor);
    
}
