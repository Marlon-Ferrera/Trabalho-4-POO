public class Aviao implements Veiculo {
    private String marca;
    private double velocidade;
    private String tipo;

    public Aviao(){}

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String Mover(int metros) {
        return marca + " voou " + metros + " metros.";
    }
}
