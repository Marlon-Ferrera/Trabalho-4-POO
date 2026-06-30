public interface ControleRemoto {
    int volumePadrao = 60;
    void MudarCanal(int canal);
    void AumentarVolume(int taxa);
    void DiminuirVolume(int taxa);
    boolean LigarTV();
    boolean DesligarTV();
}