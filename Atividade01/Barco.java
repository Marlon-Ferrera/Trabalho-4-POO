public class Barco implements Veiculo{
    private String marca;
    private double velocidade;
    private double tamanho;

    public Barco() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade <= velocidadeMaxima) {
            this.velocidade = velocidade;
        }
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String Mover(int metros) {
        return marca + " navegou " + metros + " metros.";
    }
}
