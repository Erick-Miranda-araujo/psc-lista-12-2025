package lista12_01;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }    
    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double quilos) {
        if (quilos > 0) {
            peso += quilos;
        }
    }

    public void emagrecer(double quilos) {
        if (quilos > 0) {
            peso -= quilos;
        }
    }

    public void crescer(double centimetros) {
        if (centimetros > 0) {
            altura += centimetros;
        }
    }

}
