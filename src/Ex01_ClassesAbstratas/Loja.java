package Ex01_ClassesAbstratas;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        //Lista novosProdutos armazenará objetos da classe Produtos;
        //Produtos é uma classe abstrata (superclasse das classes CDs, Livros e DVDs);
        ArrayList<Produtos> novosProdutos = new ArrayList<>();

        //Cria objetos das classes CDs, Livros e DVDs, passando os atributos para os respectivos construtores e adicionando com o método add;
        CDs cd1 = new CDs("Lover", 42.90, 18);
        CDs cd2 = new CDs("Silva canta Marisa", 29.90, 15);
        Livros livro1 = new Livros("Rita Lee: Uma autobiografia", 50.60, "Rita Lee");
        Livros livro2 = new Livros("Panelinha", 139.65, "Rita Lobo");
        DVDs dvd1 = new DVDs("Numanice", 35.70, 135);

        novosProdutos.add(cd1);
        novosProdutos.add(cd2);
        novosProdutos.add(livro1);
        novosProdutos.add(livro2);
        novosProdutos.add(dvd1);

        System.out.println("\n--------------------- ITENS DA LOJA ---------------------");
        //for (int i = 0; i < novosProdutos.size(); i++) {
        //    Produtos item = novosProdutos.get(i);
        //    item.mostrarDetalhesDoItem();
        for (Produtos item : novosProdutos) {
            item.mostrarDetalhesDoItem();
        }
    }
}
