package Ex01_ClassesAbstratas;

public abstract class Produtos {

    //define as propriedades e comportamentos comuns a todos os Produtos
    //Atributos (nome e preco)
    public String nome;
    public double preco;

    //Construtor para inicializar esses atributos
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    protected Produtos() {
    }

    //método abstrato mostrarDetalhesDoItem() que deve ser implementado nas classes filhas
    public abstract void mostrarDetalhesDoItem();
}