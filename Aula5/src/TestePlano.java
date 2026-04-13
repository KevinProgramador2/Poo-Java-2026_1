package src;

public class TestePlano {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Amil", "1234557", "Checkup");
        Medico medico = new Medico("Amil", "122", "Carlos");
        Anestesista anestesista = new Anestesista("Amil", "2132", "José", "Raqui");
        ControlePagamento cp = new ControlePagamento();

        planoSaude pl = new Clinica(null, null, null);

        System.out.println(clinica);
        System.out.println("Valor Pago Clínica:" + clinica.calcularPagamento());
        cp.calcularPagamento(clinica);

        System.out.println(medico);
        System.out.println("Valor Pago Médico:" + medico.calcularPagamento());

        System.out.println(anestesista);
        System.out.println("Valor Pago Anestesista:" + anestesista.calcularPagamento());
    }
}