package com.alura.limitecartao.operacoes;

import com.alura.limitecartao.objeto.CartaoDeCredito;
import com.alura.limitecartao.objeto.ItensDeCompra;
import com.alura.limitecartao.objeto.TelaDoApp;

public class App{

    public static void main(String[] args){
        TelaDoApp novaTela = new TelaDoApp();
        novaTela.pulaLinha();
        novaTela.exibeAsteriscos();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(novaTela.recebeLimiteDoCartao());
        novaTela.exibeLimiteDoCartao(cartaoDeCredito.getLimiteDoCartao());

        while(novaTela.getOpcaoEscolhida() != novaTela.getOpcaoParaSair()){
            novaTela.exibeAsteriscos();
            novaTela.pulaLinha();
            ItensDeCompra item = new ItensDeCompra(novaTela.recebeItemDeCompra());
            item.setValorDoItem(novaTela.recebeValorDoItem(), novaTela);
            boolean operacaoFeitaComSucesso = cartaoDeCredito.subtraiLimiteDoCartao(item.getValorDoItem());
            if (operacaoFeitaComSucesso){
                novaTela.exibeItemDeCompra(item);
                cartaoDeCredito.adicionarItemAListaDeCompra(item);
                System.out.println(item);
            }
            novaTela.pulaLinha();
            novaTela.setOpcaoEscolhida(novaTela.recebeOpcaoDoUsuario());
            
        }
        novaTela.pulaLinha();
        novaTela.exibeAsteriscos();
        novaTela.exibeMensagemExtrato();
        cartaoDeCredito.ordenaListaDeCompra();
        novaTela.exibeListaDeCompra(cartaoDeCredito);
        novaTela.exibeAsteriscos();
        novaTela.pulaLinha();
        novaTela.exibeMensagemOperacaoFinalizada();
        novaTela.pulaLinha();
    }
}

