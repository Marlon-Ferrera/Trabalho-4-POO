public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setVelocidade(180);
        carro.setPorta(4);


        Aviao aviao = new Aviao();
        aviao.setMarca("Boeing");
        aviao.setVelocidade(100);
        aviao.setTipo("747");



        Barco barco = new Barco();
        barco.setMarca("Iate Azul");
        barco.setVelocidade(90);
        barco.setTamanho(15.5);


        veiculos[0] = carro;
        veiculos[1] = aviao;
        veiculos[2] = barco;

        for (Veiculo v : veiculos) {
            System.out.println("Tipo: " + v.getClass().getSimpleName());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Velocidade: " + v.getVelocidade());
            System.out.println(v.Mover(100));
            System.out.println("-".repeat(20));
        }
    }
}
