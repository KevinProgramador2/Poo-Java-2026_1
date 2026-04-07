public class Maratona {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double altura;

    public Maratona(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public boolean verificarSituacao() {
        if (idade >= 18 && altura >= 1.80) {
            System.out.println("Esta apto para a maratona!");
            return true;
        } else {
            System.out.println("Não está apto para a maratona!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Atleta: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura;
    }

}
