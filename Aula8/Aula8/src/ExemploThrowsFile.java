
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrowsFile {
    public static void main(String[] args) {
        try {
            FileReader leitura = new FileReader("\\Aula\\teste.txt");
            System.out.println("Aquivo encontrado");

        } catch (FileNotFoundException e) {
            System.err.println("Aquivo não encontrado!");
        }
    }
}
