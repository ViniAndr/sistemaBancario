
package application;

import entities.ContaPoupanca;
import entities.Titular;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Titular titular = new Titular("Vini", "vini@google.com", "rua de narnia");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, 123, 1000.00, titular);
        //Codigo abaixo apenas para teste dos metodos da class ContaPoupanca
        System.out.println(contaPoupanca.getSaldo());
        System.out.println("saque");
        double valor = sc.nextDouble();
        contaPoupanca.sacar(valor);
        System.out.println(contaPoupanca.getSaldo());
        System.out.println("deposito");
        valor = sc.nextDouble();
        contaPoupanca.depositar(valor);
        System.out.println(contaPoupanca.getSaldo());
        
        
        sc.close();
    }
    
}
