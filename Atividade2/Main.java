public class Main {
    public static void main(String[] args) {
        RadioRelogio aparelho = new RadioRelogio();

        // Teste Radio
        aparelho.setEmissora(89.7, "FM");
        aparelho.setVolumeRadio(7);
        System.out.println("Emissora: " + aparelho.getEmissora() + " " + aparelho.getTipoEmissora());
        System.out.println("Volume Radio: " + aparelho.getVolumeRadio());

        System.out.println("-----------------------------------");

        // Teste Relogio
        aparelho.setHorario("10:30");
        aparelho.setHorarioAlarme("18:00");
        aparelho.setVolumeRelogio(3);
        System.out.println("Horário atual: " + aparelho.getHorario());
        System.out.println("Horário do alarme: " + aparelho.getHorarioAlarme());
        aparelho.ligarAlarme();
        aparelho.desligarAlarme();
    }
}
