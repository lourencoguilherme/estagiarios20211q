package heranca;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ProgramaHeranca {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("123456789");
        professor.setNome("Pedro");
        professor.setIdade(LocalDateTime.now());
        professor.setMaterias(Arrays.asList("Java","Node"));

        professor.mostraProfessor();

        Professor professorComArgumentos = new Professor("4444444", "Argumentos", LocalDateTime.now(), Arrays.asList("Java","Node"));
        professorComArgumentos.mostraProfessor();


        Aluno aluno = new Aluno();
        aluno.setCpf("123456789");
        aluno.setNome("Pedro");
        aluno.setIdade(LocalDateTime.now());
        aluno.setMatricula(19283903484L);
        print(aluno);

        Aluno alunoComArgumentos = new Aluno("555555", "Aluno", LocalDateTime.now(), 444444L);
        print(alunoComArgumentos);

    }

    private static void print(Object object){
        System.out.println(object);
    }
}
