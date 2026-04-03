import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ambrósio", 5000);

        double inss = f.calcularInss();
        double valeTransporte = f.calcularValeTransporte();
        double salario = f.getSalario();
        salario = salario - (inss + valeTransporte);

        JOptionPane.showMessageDialog(null, "Nome: " + f.getNome() + "\nSalário: " + f.getSalario() + "\nINSS: " + inss
                + "\nVale Transporte: " + valeTransporte + "\nSalário Líquido: " + salario);
    }
}