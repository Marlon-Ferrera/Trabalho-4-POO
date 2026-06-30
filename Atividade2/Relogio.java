public interface Relogio {
    void setHorario(String horario);
    String getHorario();
    void setHoraAlarme(String horario);
    String getHoraAlarme();
    void ligarAlarme();
    void desligarAlarme();
    void setVolumeRelogio(int vol);
    int getVolumeRelogio();
}
