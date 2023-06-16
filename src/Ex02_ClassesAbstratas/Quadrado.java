package Ex02_ClassesAbstratas;

public class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        //SUPER: permite acessar membros (atributos ou métodos) da superclasse a partir da subclasse
        // a chamada super(lado, lado) está invocando o construtor da superclasse Retangulo
        super(lado, lado);
    }
}
