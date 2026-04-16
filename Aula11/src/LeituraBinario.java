import java.io.DataInputStream;
import java.io.FileInputStream;

public class LeituraBinario {
    public static void main(String[] args) {
        try {
            FileInputStream arquivo = new FileInputStream("\\aula\\arquivo.dat");
            DataInputStream ler = new DataInputStream(arquivo);
            String resultado = ler.readUTF();
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Arquivo não encontrado!");
            e.printStackTrace();
        }
    }
}