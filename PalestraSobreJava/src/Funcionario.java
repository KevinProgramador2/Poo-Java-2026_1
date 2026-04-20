public class Funcionario {
    private String nome;
    private String setor;
    private Double salario;

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", setor=" + setor + ", salario=" + salario + "]";
    }

    public Funcionario(String nome, String setor, Double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public Funcionario(String nome2, String setor2, int i) {
        System.err.println("erro no funcionarios");
    }

    public Object getSetor() {
        System.err.println("erro no setor");
        throw new UnsupportedOperationException("Unimplemented method 'getSetor'");
    }

    public int getSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalario'");
    }

}