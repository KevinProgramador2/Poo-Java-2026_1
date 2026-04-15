public class ExemploVetor {
    public static void main(String[] args) throws Exception {

        String[] vetor = { "Mobile", "Tv", "Kindle" };
        String[] times = { "Flu", "Fla", "vas" };
        times[0] = "Flu";
        times[1] = "Fla";
        times[2] = "vas";

        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }
        System.out.println("****************");
        for (String times1 : times) {

        }
    }
}
