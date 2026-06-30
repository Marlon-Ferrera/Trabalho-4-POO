public class RadioRelogio implements Radio, Relogio{
    private String horario;
    private boolean despertar;
    private String horarioAlarme;
    private double emissora;
    private String tipoEmissora;
    private int volumeRadio;
    private  int volumeRelogio;

    public RadioRelogio(){}

    @Override
    public void setEmissora(double emissora, String tipoEmissora){
        this.emissora = emissora;
        this.tipoEmissora = tipoEmissora;
    }

    public double getEmissora() {
        return emissora;
    }

    public String getTipoEmissora() {
        return tipoEmissora;
    }

    @Override
    public void setVolumeRadio(double vol) {

    }

    public void setVolumeRadio(int vol) {
        this.volumeRadio = vol;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    // ---- Métodos de Relogio ----
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public void setHoraAlarme(String horario) {

    }

    @Override
    public String getHoraAlarme() {
        return "";
    }

    public void setHorarioAlarme(String horario) {
        this.horarioAlarme = horario;
    }

    public String getHorarioAlarme() {
        return horarioAlarme;
    }

    public void ligarAlarme() {
        this.despertar = true;
        System.out.println("Alarme ligado para " + horarioAlarme);
    }

    public void desligarAlarme() {
        this.despertar = false;
        System.out.println("Alarme desligado.");
    }

    public void setVolumeRelogio(int vol) {
        this.volumeRelogio = vol;
    }

    public int getVolumeRelogio() {
        return volumeRelogio;
    }
}
