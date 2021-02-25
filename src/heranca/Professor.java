package heranca;

import java.time.LocalDateTime;
import java.util.List;

public class Professor extends Pessoa {

    private List<String> materias;

    public Professor() {
    }

    public Professor(String cpf, String nome, LocalDateTime idade, List<String> materias) {
        setCpf(cpf);
        setNome(nome);
        setIdade(idade);
        this.materias = materias;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }


    public void mostraProfessor() {
        System.out.println("Professor{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade=" + super.getIdade() +
                ", materias=" + materias +
                '}');
    }

    @Override
    public LocalDateTime getIdade() {

        return LocalDateTime.MAX;
    }
}
