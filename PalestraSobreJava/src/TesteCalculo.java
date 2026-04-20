public class TesteCalculo {
    public static void main(String[] args) {
        Calculo calculo = (a, b) -> (a + b);
        {
            System.out.println(calculo.operacao(10, 50));
        }
        Calculo calculo2 = new Calculo() {

            @Override
            public int operacao(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Resultado = " + calculo2.operacao(100, 50));
    }
}
