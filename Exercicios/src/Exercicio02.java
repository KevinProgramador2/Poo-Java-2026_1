public class Exercicio02 {
    /*
     * 2)Dados três números, crie um programa que exiba o maior dentre os números
     * informados. Use o operador ? :
     * que já foi estudado (dica: será necessário utilizar dois operadores ? : para
     * se chegar ao
     * resultado). Por
     * exemplo, dados os números 10, 23 e 5, o resultado esperado do exercício deve
     * ser:
     * número 1 com o valor 10
     * número 2 com o valor 23
     * número 3 com o valor 5
     * O maior número é 23
     */

    public static void main(String[] args) {
        int num1 = 120, num2 = 23, num3 = 5;

        System.out.println("número 1 com o valor " + num1);
        System.out.println("número 2 com o valor " + num2);
        System.out.println("número 3 com o valor " + num3);

        int maior = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("O maior número é " + maior);
    }
}