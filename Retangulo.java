package lista12_01;

public class Retangulo {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorlados(double novaBase, double novaAltura) {
        this.base = novaBase;
        this.altura = novaAltura;
    }

    public String retornarValorLados() {
        return "Base: " + base + ", Altura: " + altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
