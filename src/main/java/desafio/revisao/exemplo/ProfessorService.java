package desafio.revisao.exemplo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProfessorService implements PessoaServiceInterface<Professor>{
    @Override
    public Professor cadastro() {
        Professor professor = new Professor();
        professor.setIdade(20);
        professor.setCnpj(838383L);
        professor.setNome("Professor");

        return professor;
    }

    @Override
    public void atualizar(Professor tipoClasse) {
        tipoClasse.setIdade(30);
        tipoClasse.setCnpj(1111111L);
        tipoClasse.setNome("Professor Atualizado");
    }
}
