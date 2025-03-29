/*package aplication;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Informe o produto");

        produto.produto = teclado.next();

        //System.out.println("Informe a quantidade");
        JOptionPane.showInputDialog(null, "Informe a quantidade");

        produto.quantidade = teclado.nextDouble();

        //System.out.println("Informe o preço");
        JOptionPane.showInputDialog(null, "Informe o preço");

        produto.preco = teclado.nextDouble();

        System.out.println(
                "Confirmação: " + produto.produto + "Estoque: " + produto.quantidade + "Preço: " + produto.preco);

        System.out.println("Quer adicionar mais itens para o estoque? ");

        int estoque = teclado.nextInt();

        produto.addProduto(estoque);

        System.out.println(
                "Atualização: " + produto.produto + "Estoque: " + produto.quantidade + "Preço " + produto.preco);

        System.out.println("Atualmente, alguma venda foi realizada? ");

        estoque = teclado.nextInt();
        produto.subProduto(estoque);

        System.out.println(
                "Atualização: " + produto.produto + "Estoque: " + produto.quantidade + "Preço" + produto.preco +
                        "Venda: " + produto.preco * produto.quantidade);

        JOptionPane.showConfirmDialog(null,
              "Atualização pós vendas: " + produto.produto + "Estoque atual: " + produto.quantidade + "Preço: "
                    + produto.preco + "Valor atual do estoque " + produto.preco * produto.quantidade);
        //System.out.println("Atualização pós vendas: " + produto.produto + "Estoque atual: " + produto.quantidade + "Preço: "
           //     + produto.preco + "Valor atual do estoque " + produto.preco * produto.quantidade);

        teclado.close();
    }

}
*/

package aplication;

import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {

        Produto produto = new Produto();

        // Usando JOptionPane para capturar informações do usuário
        produto.produto = JOptionPane.showInputDialog("Informe o produto");

        // Usando JOptionPane para capturar quantidade
        String quantidadeStr = JOptionPane.showInputDialog("Informe a quantidade");
        produto.quantidade = Double.parseDouble(quantidadeStr); // Convertendo para double

        // Usando JOptionPane para capturar o preço
        String precoStr = JOptionPane.showInputDialog("Informe o preço");
        produto.preco = Double.parseDouble(precoStr); // Convertendo para double

        // Exibindo confirmação com JOptionPane
        JOptionPane.showMessageDialog(null, "Confirmação: " + produto.produto + "\nEstoque: " + produto.quantidade + "\nPreço: " + produto.preco);

        // Perguntando se quer adicionar mais itens ao estoque
        String estoqueStr = JOptionPane.showInputDialog("Quer adicionar mais itens para o estoque?");
        int estoque = Integer.parseInt(estoqueStr); // Convertendo para int
        produto.addProduto(estoque);

        // Exibindo a atualização do estoque
        JOptionPane.showMessageDialog(null, "Atualização: " + produto.produto + "\nEstoque: " + produto.quantidade + "\nPreço: " + produto.preco);

        // Perguntando se alguma venda foi realizada
        String vendaStr = JOptionPane.showInputDialog("Atualmente, alguma venda foi realizada?");
        estoque = Integer.parseInt(vendaStr); // Convertendo para int
        produto.subProduto(estoque);

        // Exibindo a atualização após a venda
        JOptionPane.showMessageDialog(null,
                "Atualização: " + produto.produto + "\nEstoque: " + produto.quantidade + "\nPreço: " + produto.preco +
                        "\nVenda: " + produto.preco * produto.quantidade);

        // Exibindo a atualização final após as vendas
        JOptionPane.showMessageDialog(null,
                "Atualização pós vendas: " + produto.produto + "\nEstoque atual: " + produto.quantidade + "\nPreço: "
                        + produto.preco + "\nValor atual do estoque: " + produto.preco * produto.quantidade);
    }
}
