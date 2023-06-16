package Ex01_ClassesAbstratas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Loja {
    public static void main(String[] args) {

        Scanner entradaDoUsuario = new Scanner(System.in);

        //Lista novosProdutos armazenará objetos da classe Produtos;
        //Produtos é uma classe abstrata (superclasse das classes CDs, Livros e DVDs);
        ArrayList<Produtos> novosProdutos = new ArrayList<>();

        //Cria objetos das classes CDs, Livros e DVDs, passando os atributos para os respectivos construtores e adicionando com o método add;
        CDs cd1 = new CDs(1001, "Lover", 42.90, 18);
        CDs cd2 = new CDs(1001, "Lover", 42.90, 18);
        CDs cd3 = new CDs(1003, "Lover", 42.90, 18);
        CDs cd4 = new CDs(1004, "Silva canta Marisa", 29.90, 15);
        Livros livro1 = new Livros(2001, "Rita Lee: Uma autobiografia", 50.60, "Rita Lee");
        Livros livro2 = new Livros(2002, "Panelinha", 139.65, "Rita Lobo");
        DVDs dvd1 = new DVDs(3001, "Numanice", 35.70, 135);

        novosProdutos.add(cd1);
        novosProdutos.add(cd2);
        novosProdutos.add(cd3);
        novosProdutos.add(cd4);
        novosProdutos.add(livro1);
        novosProdutos.add(livro2);
        novosProdutos.add(dvd1);

        System.out.println("\n--------------------- BUSCA DE ITENS ---------------------");
        System.out.print("Digite o código do produto: ");
        int codigoInformado = entradaDoUsuario.nextInt();

        boolean produtoEmEstoque = false;

        for (int i = 0; i < novosProdutos.size(); i++) {
            Produtos produto = novosProdutos.get(i);
            if (produto.getCodigoDeBarra() == codigoInformado) {
                System.out.println("O produto foi encontrado no índice: " + i);
                produto.mostrarDetalhesDoItem();
                produtoEmEstoque = true;
                break; // Encerra o loop se produto for encontrado
            }
        }
        if (produtoEmEstoque == false) {
            System.out.println("O produto não foi encontrado.");
        }

        System.out.println("\nDeseja ver o catálogo da loja? SIM ou NAO");
        String simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("SIM")) {
            System.out.println("\n--------------------- CATÁLOGO DA LOJA ---------------------");
            //for (int i = 0; i < novosProdutos.size(); i++) {
            //    Produtos item = novosProdutos.get(i);
            //    item.mostrarDetalhesDoItem();

            //cria um novo conjunto (Set) chamado codigoSet para armazenar os códigos de barra dos produtos
            //HashSet<Integer>() é a chamada do construtor da classe. Ele é uma implementação da interface Set, que é uma coleção que não permite elementos duplicados
            Set<Integer> codigoSet = new HashSet<>();
            for (Produtos produto : novosProdutos) {
                if (!codigoSet.add(produto.getCodigoDeBarra())) {
                    System.out.printf("\n----------------------> Atenção! <----------------------" +
                            "\nAltere o código do produto: %s. " +
                            "\nO código está incorreto ou duplicado.%n" + "--------------------------------------------------------",
                            produto.getNome()
                    );
                }
            }

            for (Produtos item : novosProdutos) {
                item.mostrarDetalhesDoItem();
            }
        };
    }
        }



