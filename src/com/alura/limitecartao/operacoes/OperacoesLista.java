package com.alura.limitecartao.operacoes;
import java.util.ArrayList;
import java.util.Scanner;
import com.alura.limitecartao.objeto.ItensDeCompra;

public class OperacoesLista {

    public static ArrayList<ItensDeCompra> listaDeItens = new ArrayList<ItensDeCompra>();

    public static ArrayList getListaDeItens(){
        return listaDeItens;
    }

    public double recebeValorDoItem(){
        Scanner leituraDoValor = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = leituraDoValor.nextDouble();
        return valor;
    }

    public static void insereItemNaLista(ItensDeCompra item){
        listaDeItens.add(item);
    }
        
        
}
