
package application;

import entities.ContaCorrente;
import entities.Titular;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Titular titular = new Titular("Vini", "vini@google.com", "rua de narnia");
        
        ContaCorrente contaCorrente = new ContaCorrente(1, 123, 1500.00, titular);
        //Codigo abaixo apenas para teste dos metodos da class ContaCorrent com limites adicionados
        System.out.println(contaCorrente.getSaldo());
        System.out.println("saque");
        double valor = sc.nextDouble();
        contaCorrente.sacar(valor);
        System.out.println(contaCorrente.getSaldo());
        System.out.println("deposito");
        valor = sc.nextDouble();
        contaCorrente.depositar(valor);
        System.out.println(contaCorrente.getSaldo());
        
        
        sc.close();
    }
    
}
