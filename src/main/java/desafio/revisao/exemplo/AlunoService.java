package desafio.revisao.exemplo;

public class AlunoService implements PessoaServiceInterface<Aluno>{
    @Override
    public Aluno cadastro() {
        Aluno aluno = new Aluno();
        aluno.setIdade(10);
        aluno.setMatricula(123);
        aluno.setNome("Aluno");

        return aluno;
    }

    @Override
    public void atualizar(Aluno tipoClasse) {
        tipoClasse.setIdade(20);
        tipoClasse.setMatricula(321);
        tipoClasse.setNome("Aluno Atualizado");
    }
}
