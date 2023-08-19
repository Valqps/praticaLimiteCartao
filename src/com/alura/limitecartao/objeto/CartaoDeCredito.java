package com.alura.limitecartao.objeto;

import java.util.Scanner;

public class CartaoDeCredito {
    private double limiteDoCartao;

    public void recebeLimiteDoCartao(){
        System.out.println("Qual o limite do cartão?");
        Scanner leitura = new Scanner(System.in);
        limiteDoCartao = leitura.nextDouble();
    }

    public double getLimiteDoCartao(){
        return limiteDoCartao;
    }

    public boolean subtraiLimiteDoCartao(double valor){
        if (this.limiteDoCartao >= valor){
            this.limiteDoCartao -= valor;
            return false;
        } else {
            System.out.println("\nLimite insuficiente");
            return true;
        }
    }
}
