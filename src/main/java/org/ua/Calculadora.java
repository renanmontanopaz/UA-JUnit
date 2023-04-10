package org.ua;


import java.awt.geom.Arc2D;

/*
 *
 * Criar uma classe chamada calculadora, com os seguintes métodos:
 * - Somar
 * - Subtrair
 * - Dividir
 * - Multiplicar
 *
 * Em seguida criar uma classe de teste chamada CalculadoraTest para cobrir
 * as funcionalidades da classe.
 *
 * Entrega: Criar uma branch seguindo o padrão "ua-seunome-seusobrenome". Criar um pull request para branch "entrega-01"
 *
 * */
public class Calculadora {

    private double resultado;
    private boolean liga;

    public double getResultado() {
        return resultado;
    }

    public void ligar() {
        this.liga = true;
    }

    public void desligar(){
        this.liga = false;
    }

    public void Somar(double n1, double n2){
        if (this.liga && (n1 >= 0) && (n2 >= 0)){
            this.resultado += n1+n2;
        } else {
            throw new RuntimeException("Erro");
        }
    }
    public void Dividir(double n1, double n2){
        if (this.liga && (n1 > 0) && (n2 > 0)){
            this.resultado += n1/n2;
        } else {
            throw new RuntimeException("Erro");
        }
    }
    public void Subtrair(double n1, double n2){
        if (this.liga && (n1 > 0) && (n2 > 0)){
            this.resultado += n1-n2;
        } else {
            throw new RuntimeException("Erro");
        }
    }
    public void Multiplicar(double n1, double n2){
        if (this.liga && (n1 > 1) && (n2 > 1)){
            this.resultado += n1*n2;
        } else {
            throw new RuntimeException("Erro");
        }
    }
}
