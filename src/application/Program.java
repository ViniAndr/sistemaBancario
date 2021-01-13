
package application;

import entities.ContaCorrente;
import entities.ContaEspecial;
import entities.ContaPoupanca;
import entities.Titular;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Seja Bem Vindo Ao Banco CPT");
        System.out.println("");
        System.out.print("Nome do Titular: ");
        String nome = input.nextLine();
        System.out.print("Digite seu Email: ");
        String email = input.nextLine();
        System.out.print("Digite seu Endereço: ");
        String endereco = input.nextLine();
        
        Titular titular = new Titular(nome, email, endereco);
        ContaPoupanca contaPoupanca = new ContaPoupanca(titular);
        
        System.out.print("Deseja fazer um Deposito (y/n)? ");
        char op = input.next().charAt(0);
        if(op == 'y'){
            System.out.print("Valor a ser depositado: ");
            double valor = input.nextDouble();
            contaPoupanca.depositar(valor);
            System.out.println(contaPoupanca);
        }else{
            System.out.println(contaPoupanca);
        }
        
        
        input.close();
    }
    
}
