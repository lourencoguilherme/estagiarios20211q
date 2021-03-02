package desafio.revisao.exemplo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aluno extends Pessoa {
    private Integer matricula;

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome=" + getNome() +
                ", idade=" + getIdade() +
                '}';
    }
}
