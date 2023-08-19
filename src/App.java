import java.util.Scanner;

import com.alura.limitecartao.objeto.CartaoDeCredito;
import com.alura.limitecartao.objeto.ItensDeCompra;
import com.alura.limitecartao.operacoes.OperacoesCompra;
import com.alura.limitecartao.operacoes.OperacoesLista;

public class App {

    private static int opcaoDoUsuario;
    public static void main(String[] args) {
        CartaoDeCredito meuCartao = new CartaoDeCredito();
        meuCartao.recebeLimiteDoCartao();

        while (opcaoDoUsuario != 2){
            OperacoesLista operacoesLista = new OperacoesLista();
            System.out.println("Digite o que gostaria de comprar: ");
            Scanner leitura = new Scanner(System.in);
            ItensDeCompra item = new ItensDeCompra(leitura.nextLine());
            double valorDoItem = operacoesLista.recebeValorDoItem();
            item.setValorDoItem(valorDoItem);
            boolean ultrapassouOLimite = meuCartao.subtraiLimiteDoCartao(valorDoItem);
            System.out.println(meuCartao.getLimiteDoCartao());
            if (!ultrapassouOLimite){
                OperacoesCompra operacoesCompra = new OperacoesCompra();
                operacoesCompra.mostraOpcoesParaUsuario();
                opcaoDoUsuario = operacoesCompra.recebeOpcaoDoUsuario();
            } else {
                System.out.println("Operacao encerrada");
                return;
            }
        }
    }
}
