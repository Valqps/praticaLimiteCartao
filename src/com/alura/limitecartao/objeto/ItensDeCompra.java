package com.alura.limitecartao.objeto;

public class ItensDeCompra implements Comparable<ItensDeCompra> {
    private String nomeDoItem;
    private double valorDoItem;
    private String valorFormatadoDoItem;

    public ItensDeCompra(String nomeDoItem){
        this.nomeDoItem = nomeDoItem;
}

    public String getNomeDoItem(){
        return this.nomeDoItem;
    }

    public void setValorDoItem(double valorDoItem, TelaDoApp telaDoApp){
        this.valorDoItem = valorDoItem;
        this.valorFormatadoDoItem = telaDoApp.formataValorParaDinheiro(valorDoItem);
    }

    public double getValorDoItem(){
        return valorDoItem;
    }

    @Override
    public String toString(){
        if(nomeDoItem.length()<10){
            return "Item: " + nomeDoItem.toUpperCase() + "\t\t\tValor: " + valorFormatadoDoItem;
        } else {
            return "Item: " + nomeDoItem.toUpperCase() + "\t\tValor: " + valorFormatadoDoItem;
        }
    }

    @Override
    public int compareTo(ItensDeCompra outroItem) {
        return Double.valueOf(this.valorDoItem).compareTo(Double.valueOf(outroItem.valorDoItem));
    }
}
