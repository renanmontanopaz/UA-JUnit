package org.ua;

public class Conta {
    private double saldo;
    private boolean ativo;

    public double getSaldo() {
        return saldo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void inativar() {
        this.ativo = false;
    }

    public void depositar(double valor){
        if (this.ativo){
            this.saldo += valor;
        } else {
            throw new RuntimeException("Conta Inativa, não pode depositar");
        }
    }

    public void sacar(double valor){
        if (this.ativo && (this.saldo - valor >= 0)){
            this.saldo -= valor;
        } else {
            throw new RuntimeException("Conta inativa ou saldo inferior ao valor de saque!");
        }
    }

}