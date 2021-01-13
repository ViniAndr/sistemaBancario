
package entities;

import java.util.Random;

public abstract class Conta{
    Random random = new Random();
    private Integer numero = random.nextInt(9999);
    private Integer agencia = 077;
    protected double saldo;
    
    private Titular titular;
    /*
    Constructor com parametros numeor da conta, agencia, saldo(Apenas para teste),
    Titular, que recebe por parametro(Nome, Email, Enderenço).
    */
    public Conta(Titular titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public double getSaldo() {
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
