package lista12_01;

public class Quadrado {

    private double tamanhodoLado;

    public double getTamanhodoLado() {
        return tamanhodoLado;
    }

    public void setTamanhodoLado(double tamanhodoLado) {
        this.tamanhodoLado = tamanhodoLado;
    }

    public Quadrado(double tamanhodoLado) {
        this.tamanhodoLado = tamanhodoLado;
    }

    public void mudarValorLado(double novoValor) {
        this.tamanhodoLado = novoValor;
    }

    public double retornarValorLado() {
        return this.tamanhodoLado;
    }

    public double calcularArea() {
        System.out.println("A area do quedrado é:");
        return this.tamanhodoLado * this.tamanhodoLado;

    }
}
