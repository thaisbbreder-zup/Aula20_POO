package Ex01_ClassesAbstratas;

public class CDs extends Produtos {
    public Integer numeroDeFaixas;

    public CDs(int codigoDeBarra, String nome, double preco, int numeroDeFaixas) {
        this.codigoDeBarra = codigoDeBarra;
        this.nome = nome;
        this.preco = preco;
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem(){
        System.out.println("\nCódigo: " + this.codigoDeBarra);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Número de Faixas: " + this.numeroDeFaixas);
    }
}
