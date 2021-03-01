package heranca;

import java.time.LocalDateTime;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDateTime idade;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, LocalDateTime idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getIdade() {
        return idade;
    }

    public void setIdade(LocalDateTime idade) {
        this.idade = idade;
    }
}
