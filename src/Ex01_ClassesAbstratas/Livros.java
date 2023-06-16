package Ex01_ClassesAbstratas;

public class Livros extends Produtos {
    public String autor;

    public Livros(String nome, double preco, String autor) {

        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Autor: " + this.autor);
    }
}
