package com.alura.limitecartao.objeto;

public class ItensDeCompra {
    private String nomeDoItem;
    private double valorDoItem;

    public ItensDeCompra(String nomeDoItem){
        this.nomeDoItem = nomeDoItem;
}

    public String getNomeDoItem(){
        return this.nomeDoItem;
    }

    public void setValorDoItem(double valorDoItem){
        this.valorDoItem = valorDoItem;
    }

    public double getValorDoItem(){
        return valorDoItem;
    }

}
