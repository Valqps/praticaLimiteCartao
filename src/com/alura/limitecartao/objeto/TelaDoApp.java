package com.alura.limitecartao.objeto;
import java.util.Scanner;

public class TelaDoApp {

    private String opcoesParaUsuario = """
            ** O que você gostaria de fazer? **
            1 - Comprar um novo produto no seu cartão de crédito
            2 - Sair
            """;
    private int opcaoEscolhida;
    private int opcaoParaSair = 2;

    public int getOpcaoEscolhida() {
        return opcaoEscolhida;
    }

    public void setOpcaoEscolhida(int opcaoEscolhida) {
        this.opcaoEscolhida = opcaoEscolhida;
    }

    public int getOpcaoParaSair() {
        return opcaoParaSair;
    }

    public void pulaLinha(){
        System.out.println("\n");
    }

    public void exibeAsteriscos(){
        for(int i = 0 ; i < 50; i++){
            System.out.print("*");
        }
    }

    public double recebeLimiteDoCartao(){
        System.out.print("\nQual o limite do cartão? R$ ");
        Scanner leitura = new Scanner(System.in);
        return leitura.nextDouble();
    }

    public void exibeLimiteDoCartao(double valor){
        String valorFormatado = formataValorParaDinheiro(valor);
        System.out.println("O limite do seu cartão é " + valorFormatado);
    }

    public int recebeOpcaoDoUsuario(){
        System.out.println(opcoesParaUsuario);
        Scanner leitura = new Scanner(System.in);
        return leitura.nextInt();
    }

    public String recebeItemDeCompra(){
        System.out.print("O que gostaria de comprar? ");
        Scanner leitura = new Scanner(System.in);
        String item = leitura.nextLine();
        return item;
    }

    public double recebeValorDoItem(){
        System.out.print("Qual o valor? R$ ");
        Scanner leitura = new Scanner(System.in);
        return leitura.nextDouble();
    }

    public void exibeItemDeCompra(ItensDeCompra item){
        System.out.println("O item " + item.getNomeDoItem() + " foi comprado com sucesso.");
    }

    public String formataValorParaDinheiro(double valor){
        return String.format("R$ %.2f", valor);
    }

    public void exibeMensagemExtrato(){
        System.out.println("\n*** Extrato de Utilizacao ***");
    }

    public void exibeListaDeCompra(CartaoDeCredito cartao){
        for(ItensDeCompra item : cartao.getListaDeCompra()){
            System.out.println(item);
        }
    }

    public void exibeMensagemOperacaoFinalizada(){
        System.out.println("Operacao Encerrada");
    }
    
}
