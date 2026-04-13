public class Atleta {
    protected String nome;
    protected double peso;
    protected String modalidade;
    protected int totalParticipantes;

    public Atleta(String nome, double peso, String modalidade, int totalParticipantes) {
        this.nome = nome;
        this.peso = peso;
        this.modalidade = modalidade;
        this.totalParticipantes = totalParticipantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getTotalParticipantes() {
        return totalParticipantes;
    }

    public void setTotalParticipantes(int totalParticipantes) {
        this.totalParticipantes = totalParticipantes;
    }

    public Pais(){
        
    }

}
