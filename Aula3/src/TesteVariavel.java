import java.lang.reflect.Constructor;

public class TesteVariavel {
    public static void main(String[] args) {

        Medico medico1 = new Medico(1234, "Kevin", 200);
        Medico medico2 = new Medico(125, "Luana", 400);
        Medico medico3 = new Medico(234, "Natalia", 260);

        System.out.println("Total de medicos cadastrados: " + Medico.getTotalMedicos());

    }
}
