package Ex01_ClassesAbstratas;

public class DVDs extends Produtos {
    public int duracao;

    public DVDs(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Duração: " + this.duracao);
    }
}
