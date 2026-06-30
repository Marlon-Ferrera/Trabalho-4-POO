public class Carro implements Veiculo{
    private String marca;
    private double velocidade;
    private int porta;


    public Carro() {}

    public Carro(String marca, double velocidade, int porta) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.porta = porta;
    }

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

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String Mover(int metros) {
        return marca + " se moveu " + metros + " metros.";
    }
}

