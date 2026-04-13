import java.time.LocalDate;

public abstract class Ave extends Animal {
    private String cor;

    public Ave(String nome, LocalDate dataVacinacao, String cor) {
        super(nome, dataVacinacao);
    }

    public String voar() {
        return ("Voando");
    }
}
