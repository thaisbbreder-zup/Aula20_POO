package Ex01_ClassesAbstratas;

public class DVDs extends Produtos {
    public int duracao;

    public DVDs(int codigoDeBarra, String nome, double preco, int duracao) {
        this.codigoDeBarra = codigoDeBarra;
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem(){
        System.out.println("\nCódigo: " + this.codigoDeBarra);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Duração: " + this.duracao);
    }
}
