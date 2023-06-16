package Ex01_ClassesAbstratas;

import java.util.Objects;

public abstract class Produtos {

    //define as propriedades e comportamentos comuns a todos os Produtos
    //Atributos (nome e preco)
    public int codigoDeBarra;
    public String nome;
    public double preco;

    //Construtor para inicializar esses atributos
    public Produtos(int codigoDeBarra, String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarra = codigoDeBarra;
    }

    protected Produtos() {
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    //método abstrato mostrarDetalhesDoItem() que deve ser implementado nas classes filhas
    public abstract void mostrarDetalhesDoItem();

    //compara se dois objetos do tipo Produtos são iguais
    @Override
    public boolean equals(Object o) {
        //verifica se o objeto sendo comparado é o mesmo objeto atual
        if (this == o) return true;
        //verifica se o objeto sendo comparado é nulo ou pertence a uma classe diferente
        //O método getClass retorna o objeto Class que representa o tipo do objeto em tempo de execução
        if (o == null || getClass() != o.getClass()) return false;
        //Se as duas verificações falharem, significa que o objeto sendo comparado é um objeto Produtos e pertence a mesma classe
       //Compara apenas o código de barras dos produtos ---> Objects.equals(a, b)
        Produtos produtos = (Produtos) o;
        return Objects.equals(getCodigoDeBarra(), produtos.getCodigoDeBarra());
    }

    public String getNome(){
        return nome;
    }
}