package heranca;

import java.time.LocalDateTime;

public class Aluno extends Pessoa {

    private Long matricula;

    public Aluno() {
    }

    public Aluno(String cpf, String nome, LocalDateTime idade, Long matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }


    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "O aluno é " + super.getNome() + " a matricula é " + this.matricula;
    }
}
