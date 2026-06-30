public class Main {
    public static void main(String[] args) {
        ModeloTV tv = new ModeloTV(50);
        tv.setMarca("LG");
        tv.setModelo("Smart Full HD 4k");

        System.out.println("=".repeat(20));

        tv.LigarTV();
        System.out.println("--------------------------");
        tv.MudarCanal(15);
        System.out.println("--------------------------");
        tv.AumentarVolume(20);
        System.out.println("--------------------------");
        tv.DiminuirVolume(8);
        System.out.println("--------------------------");
        System.out.println("Marca da TV: " + tv.getMarca());
        System.out.println("--------------------------");
        System.out.println("Modelo da TV: " + tv.getModelo());
        System.out.println("--------------------------");
        System.out.println("Tamanho da TV: " + tv.getTamanho());
        System.out.println("--------------------------");
        System.out.println("Canal atual: " + tv.getCanal());
        System.out.println("--------------------------");
        System.out.println("Volume atual: " + tv.getVolume());
        System.out.println("--------------------------");
        tv.DesligarTV();
    }
}