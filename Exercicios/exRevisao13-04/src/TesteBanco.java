public class TesteBanco {
    public static void main(String[] args) throws Exception {

        Cartao c = new Cartao("1234", "12/12/12");
        c.getNumero();
        c.getDataValidade();
        System.out.println(c.getNumero() + "\n" + c.getDataValidade());

        Pix p = new Pix("chavePix");

        p.setChavePix("123.321.123.11");
        p.getChavePix();
        p.pagar(200);

        BoletoBancario b = new BoletoBancario("");
        System.out.println("================");
        b.setCodigoBarras("222dfdDGS");
        // b.getCodigoBarras();
        System.out.println(b.getCodigoBarras());

    }
}
