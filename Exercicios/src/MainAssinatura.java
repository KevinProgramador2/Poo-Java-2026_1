public class MainAssinatura {
    public static void main(String[] args) {

        Assinatura assinaturaKevin = new Assinatura(50.0, "Premium");

        double taxa = assinaturaKevin.calcularTaxaManuntencao();
        double desconto = assinaturaKevin.calcularDescontoFidelidade();
        double valorFinal = assinaturaKevin.getValoBase() + taxa - desconto;

        System.out.println("----- RESUMO DA ASSINATURA -----");
        System.out.println("Cliente: Kevin");
        System.out.println("Plano Atual: " + assinaturaKevin.getPlano());
        System.out.println("Valor Base: R$ " + assinaturaKevin.getValoBase());
        System.out.println("Taxa de Manutenção (5%): R$ " + taxa);
        System.out.println("Desconto Fidelidade (10%): R$ " + desconto);
        System.out.println("VALOR TOTAL A PAGAR: R$ " + valorFinal);
        System.out.println("--------------------------------");
    }
}
