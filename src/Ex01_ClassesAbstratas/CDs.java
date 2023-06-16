package Ex01_ClassesAbstratas;

public class CDs extends Produtos {
    public Integer numeroDeFaixas;

    public CDs(String nome, double preco, int numeroDeFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Número de Faixas: " + this.numeroDeFaixas);
    }
}
