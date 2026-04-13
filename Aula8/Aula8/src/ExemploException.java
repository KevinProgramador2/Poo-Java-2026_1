import javax.swing.JOptionPane; // 1. Importação obrigatória

public class ExemploException {
    public static void main(String[] args) {
        try {
            int resultado = calcular(10, 2);

            // 2. Exibindo o resultado em uma janela de informação
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (ArithmeticException e) {
            // 3. Exibindo o erro em uma janela de alerta (ícone de X vermelho)
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro Matemático", JOptionPane.ERROR_MESSAGE);

        } finally {
            // 4. Uma mensagem final opcional
            JOptionPane.showMessageDialog(null, "Fim de programa! (FINALLY)", "Sistema", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static int calcular(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro!: Não é possível dividir por zero!");
        }
        return a / b;
    }
}