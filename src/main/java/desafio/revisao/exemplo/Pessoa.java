package desafio.revisao.exemplo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(Integer idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(Integer idade) {
        this.idade = idade;
    }

    public Integer getNome(String nome) {
        return 1;
    }
    public String getNome(Integer qualquer) {
        return "";
    }

}
