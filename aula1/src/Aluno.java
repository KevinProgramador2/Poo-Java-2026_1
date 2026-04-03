public class Aluno {
    int matricula, idade;
    String nome, telefone;
    double nota1, nota2;
    // Comportamentos - Metódos

    // metodo sem retorno
    public void imprimir() {
        System.out.println("Bem vindo a escola");
    }

    public double calcularMedia() {
        return (nota1 + nota2);
    }

    public double calcular() {
        return (nota1 + nota1) / 2;
    }

}
