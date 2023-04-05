package org.ua;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.ativar();
        conta.depositar(100.0);
        System.out.println("Valor atual da conta: " + conta.getSaldo());

        conta.sacar(70);

        conta.inativar();
        conta.depositar(50.0);
        System.out.println("Valor atual da conta: " + conta.getSaldo());

    }
}
