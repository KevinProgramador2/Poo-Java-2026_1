import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("Kevin");

        Carro carro = new Carro("Honda", LocalDate.of(2026, 10, 10), proprietario, "Silva");
        carro.trocarOleo();
        carro.revisao();

        System.out.println(proprietario);
        System.out.println(carro);
        System.out.println("Valor R$:" + carro.valorCobrado);

        Moto moto = new Moto("Fazer", 2000, LocalDate.of(2007, 12, 30), proprietario, 250);
        moto.revisao();

        System.out.println(proprietario);
        System.out.println(moto);
        System.out.println("Valor R$:" + moto.valorCobrado);

    }

}