package br.com.dio.java.basico;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Por favor, insira o numero da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Insira sua agencia: ");
        String agencia = scanner.next();

        double saldo = 1200.0;

        System.out.println("------------------------------------------------");
        System.out.println("Olá "+ nome + ", obrigado por abrir sua conta conosco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo "+ saldo + " está disponível para saque.");

    }
}