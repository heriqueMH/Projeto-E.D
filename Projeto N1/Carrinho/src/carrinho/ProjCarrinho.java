package carrinho;

/*

S.I 3H11
Matheus Henrique de Oliveira Santos - 42208149
Gabriel Sanches Tofanelo - 42251631
Rodrigo Pampolin Mendes - 42230403

*/


import java.util.*;
import java.io.*;

public class ProjCarrinho {

    public static void main(String[] args) throws Exception {
        ArrayList<Produto> estoque = new ArrayList<>();

        try {
            System.out.println("Arquivo foi carregado com sucesso\n");

            FileReader arq = new FileReader("ListaProdutos.txt");
            BufferedReader linha = new BufferedReader(arq);

            String aux = linha.readLine();

            while (aux != null) {
                String[] dados = aux.split(";");
                //0 = codigo
                //1 = descricao
                // = preço unitario
                // = qtde estoque

                Produto p1 = new Produto(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));

                estoque.add(p1);
                aux = linha.readLine();
            }

            System.out.println("Qtde de itens no carrinho: " + estoque.size());

//            for (int i = 0; i < estoque.size(); i++) {
//                estoque.get(i).mostraProduto();
//            }

        } catch (FileNotFoundException arq) {
            System.out.println("Arquivo nao foi carregado");
        }
    }
}
