package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteAluno {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            alunos.add(new Aluno("Gabriela", 8, 10));
            alunos.add(new Aluno("Ana", 7, 5));
            alunos.add(new Aluno("Maria", 11, 11));

        } catch (AlunoException e) {
            System.out.println("Erro !" + e.getMessage());
        }

        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Média: " + a.calcularMedia());
        }
    }
}