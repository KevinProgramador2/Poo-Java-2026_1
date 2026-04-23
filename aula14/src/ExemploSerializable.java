
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializable {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("123", "Xpto Ltda");
        Fornecedor f2 = new Fornecedor("234", "ABC Ltda");
        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);

        try {
            System.out.println("---------------Grava objetos no disco---------------");
            FileOutputStream caminhoArquivo = new FileOutputStream("\\aula\\funcionarios.dat");
            ObjectOutputStream gravarObjeto = new ObjectOutputStream(caminhoArquivo);
            gravarObjeto.writeObject(fornecedores);
            gravarObjeto.flush();
            gravarObjeto.close();
            caminhoArquivo.flush();
            caminhoArquivo.close();

            System.out.println("---------------Leitura do Objeto---------------");
            FileInputStream caminhoLeitura = new FileInputStream("\\aula\\funcionarios.dat");
            ObjectInputStream lerObjeto = new ObjectInputStream(caminhoLeitura);
            List<Fornecedor> listaLeituraFornecedores = (ArrayList<Fornecedor>) lerObjeto.readObject();
            lerObjeto.close();

            listaLeituraFornecedores.forEach(f -> System.out.println(f));
        } catch (Exception e) {
            System.err.println("Problemas na leitura do objeto");
            e.printStackTrace();
        }

    }
}