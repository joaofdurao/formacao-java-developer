package br.com.javadeveloper;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        registraNome(conta, input);
        registraAgencia(conta, input);
        registraNumeroConta(conta, input);
        registraSaldo(conta, input);
        saudacaoInicial(conta);


    }

    public static void registraNome(ContaTerminal conta, Scanner input){
        System.out.println("Diga seu nome: ");
        conta.setNomeCliente(input.nextLine());
    }

    public static void registraAgencia(ContaTerminal conta, Scanner input){
        System.out.println("Diga sua agência: ");
        conta.setAgencia(input.nextLine());
    }

    public static void registraNumeroConta(ContaTerminal conta, Scanner input){
        System.out.println("Diga o número da conta: ");
        conta.setNumero(input.nextInt());
    }

    public static void registraSaldo(ContaTerminal conta, Scanner input){
        System.out.println("Diga seu saldo (formato -> 999,99): ");
        conta.setSaldo(input.nextFloat());
    }

    public static void saudacaoInicial(ContaTerminal conta){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }

}
