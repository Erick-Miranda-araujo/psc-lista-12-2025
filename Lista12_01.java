package lista12_01;

import java.util.Scanner;

public class Lista12_01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a base do local (em metros): ");
        double base = entrada.nextDouble();

        System.out.print("Informe a altura do local (em metros): ");
        double altura = entrada.nextDouble();

        Retangulo retan = new Retangulo(base, altura);

        System.out.println("Base: " + retan.getBase() + " m");
        System.out.println("Altura: " + retan.getAltura() + " m");
        System.out.println("Área total: " + retan.calcularArea() + " m²");
        System.out.println("Perímetro: " + retan.calcularPerimetro() + " m");

        entrada.close();
    }

}
