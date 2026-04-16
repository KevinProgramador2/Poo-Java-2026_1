import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeitura {
    public static void main(String[] args) {

        // File arquivo = new File("\\Principais Falhas e Problemas
        // Ident\\arquivo.txt");
        Scanner leia;
        try {
            leia = new Scanner(new File("\\pssFivem\\arquivo.txt"));
            while (leia.hasNext()) {
                System.out.println(leia.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo nao encontrado");
        }
    }
}
