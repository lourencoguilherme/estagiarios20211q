package desafio.aula01.pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPessoa {

    public static void main(String[] args) {
        mostraPessoaUsandoConstrutorSemParametros();
        mostraPessoaUsandoConstrutorComParametros();

    }


    public static void mostraPessoaUsandoConstrutorSemParametros() {
        Pessoa pessoaSemparametros = new Pessoa();

        pessoaSemparametros.setNome("Pessoa construtor sem parametros");
        pessoaSemparametros.setAltura(new BigDecimal("1.75"));


        LocalDate dataNascimento = LocalDate.of(2019, 01,20);

        pessoaSemparametros.setDataNascimento(dataNascimento);

        pessoaSemparametros.imprimeDadosPessoa();
    }

    public static void mostraPessoaUsandoConstrutorComParametros() {
        String nome = "Pessoa usando construtor com parametros";
        BigDecimal altura = new BigDecimal("1.90");
        LocalDate dataNascimento = LocalDate.of(2000, 10, 03);

        Pessoa pessoaArg01 = new Pessoa(nome, altura, dataNascimento);

        Pessoa pessoaArg02 = new Pessoa(nome, dataNascimento, altura);

        pessoaArg01.imprimeDadosPessoa();

        pessoaArg02.imprimeDadosPessoa();

    }

}
