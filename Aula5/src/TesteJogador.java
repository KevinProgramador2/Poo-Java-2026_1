package src;

public class TesteJogador {
    public static void main(String[] args) {

        Time t2 = new Time("Real madrid", "Alvaro arbeloa", new Jogador[3]);

        Jogador j1 = new Jogador("Messi", 30, "Zagueiro");
        Jogador j2 = new Jogador("Pele", 78, "Zagueiro");
        Jogador j3 = new Jogador("Cristiano Ronaldo", 30, "Zagueiro");

        t2.adicionarJogador(j3);
        t2.adicionarJogador(j2);
        t2.adicionarJogador(j1);

        System.out.println(t2.getNome());
        t2.listarJogadores();

    }
}
