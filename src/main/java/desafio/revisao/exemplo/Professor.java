package desafio.revisao.exemplo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor extends Pessoa {

    private Long cnpj;

    @Override
    public String toString() {
        return "Professor{" +
                "cnpj=" + cnpj +
                " ,nome=" + getNome() +
                " ,idade=" + getIdade() +
                '}';
    }
}
