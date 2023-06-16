package Ex02_ClassesAbstratas;

public class Circulo extends Forma{
    public float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (3.14159 * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * 3.14159 * raio);
    }
}
