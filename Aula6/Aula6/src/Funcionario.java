// abstract - nao pode ter intancias
public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected double salario;
    protected String turno;
    protected Setor setor;

    public Funcionario(int id, String nome, double salario, String turno, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.turno = turno;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario:" + id + ", nome:" + nome + ", salario:" + salario + ", turno:" + turno + ", setor="
                + setor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public Setor getSetor() {
        return setor;
    }

    // Metodo abstrato - obriga os filhos a implementarem o codigo do metodo
    // Na classe super temos somente a assinatura do metodo sem escopo.
    public abstract void reajustaSalario();

}