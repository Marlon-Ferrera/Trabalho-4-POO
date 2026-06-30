public interface Veiculo {
    public double velocidadeMaxima = 200;

    String getMarca();
    void setMarca(String marca);
    double getVelocidade();
    void setVelocidade(double velocidade);
    String Mover(int metros);

}
