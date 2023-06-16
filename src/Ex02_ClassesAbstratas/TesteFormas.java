package Ex02_ClassesAbstratas;

import java.util.ArrayList;

public class TesteFormas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Retangulo(5, 3));
        formas.add(new Circulo(4));
        formas.add(new Quadrado(6));
        formas.add(new Retangulo(7, 2));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(3));

        System.out.println("------------- Instancias calculadas -------------");
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();
        }
    }
}