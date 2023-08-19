package com.alura.limitecartao.operacoes;

import java.util.Scanner;

public class OperacoesCompra {
    private String opcoesParaUsuario = """
            ** O que você gostaria de fazer? **
            1 - Comprar um novo produto no seu cartão de crédito
            2 - Sair
            """;

    public void mostraOpcoesParaUsuario(){
        System.out.println(opcoesParaUsuario);
    }

    public int recebeOpcaoDoUsuario(){
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        return opcao;
    }
}
