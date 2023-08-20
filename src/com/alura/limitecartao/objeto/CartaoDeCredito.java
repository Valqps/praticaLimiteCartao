package com.alura.limitecartao.objeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double restanteDoLimite;
    private List<ItensDeCompra> listaDeCompra = new ArrayList<ItensDeCompra>();

    public List<ItensDeCompra> getListaDeCompra() {
        return listaDeCompra;
    }

    public double getLimiteDoCartao(){
        return limiteDoCartao;
    }

    public CartaoDeCredito(double limiteDoCartao){
        this.limiteDoCartao = limiteDoCartao;
        this.restanteDoLimite = limiteDoCartao;
    }

    public boolean subtraiLimiteDoCartao(double valor){
        if (this.restanteDoLimite >= valor){
            this.restanteDoLimite -= valor;
            return true;
        } else {
            System.out.println("\nLimite insuficiente");
            return false;
        }
    }

    public void adicionarItemAListaDeCompra(ItensDeCompra item) {
        this.listaDeCompra.add(item);
    }

    public void ordenaListaDeCompra(){
        Collections.sort(this.listaDeCompra);
    }
    
}
