public class ExemploVarArgs {
    public static void main(String[] args) {
        int total = calcularSoma(10, 20, 30, 2, 50, 100);
        System.out.println("Total:" + total);
    }

    // o VarArgs aceita uma quantidade sem limites de elementos
    public static int calcularSoma(int num, int... numero) {
        // numero[5] = 200;
        int soma = 0;
        for (int numeros : numero) {
            soma += numeros;
        }
        System.out.println("Soma:" + soma);
        return soma * num;
    }
}
