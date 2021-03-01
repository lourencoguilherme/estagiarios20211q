package desafio.aula01.pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal altura;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento, BigDecimal altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }
    public Pessoa(String nome, BigDecimal altura, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public void imprimeDadosPessoa() {
        String informacoesPessoa = toString();

        System.out.println(informacoesPessoa);
    }

    public Integer calculaIdade() {

        return LocalDate.now().compareTo(this.dataNascimento);

    }

    @Override
    public String toString() {
        return "Pessoa " +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", altura=" + altura +
                ", idade=" + calculaIdade()
                ;
    }
}
