public class ModeloTV extends TV implements ControleRemoto {
    private String marca;
    private String modelo;

    public ModeloTV() {
        super();
    }

    public ModeloTV(int tamanho) {
        super(tamanho);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void MudarCanal(int canal) {
        setCanal(canal);
        System.out.println("Canal alterado para: " + canal);
    }

    @Override
    public void AumentarVolume(int taxa) {
        setVolume(getVolume() + taxa);
        System.out.println("O volume foi aumentado para: " + getVolume());
    }

    @Override
    public void DiminuirVolume(int taxa) {
        setVolume(getVolume() - taxa);
        System.out.println("Diminuindo volume para: " + getVolume());
    }

    @Override
    public boolean LigarTV() {
        setLigada(true);
        System.out.println("TV ligada.");
        return true;
    }

    @Override
    public boolean DesligarTV() {
        setLigada(false);
        System.out.println("TV desligada.");
        return false;
    }
}