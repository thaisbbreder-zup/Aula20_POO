package Ex01_ClassesAbstratas;

public class Livros extends Produtos {
    public String autor;

    public Livros(int codigoDeBarra, String nome, double preco, String autor){
        this.codigoDeBarra = codigoDeBarra;
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("\nCódigo: " + this.codigoDeBarra);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Autor: " + this.autor);
    }
}
