package desafio.revisao.exemplo;

public class ProgramaRevisaoHeranca {

    private  static  ProfessorService professorService = new ProfessorService();

    private static AlunoService alunoService = new AlunoService();

    public static void main(String[] args) {

        //Herança
        Professor professor = professorService.cadastro();

        System.out.println(professor);

        professorService.atualizar(professor);

        System.out.println(professor);

        Aluno aluno = alunoService.cadastro();
        System.out.println(aluno);

        alunoService.atualizar(aluno);

        System.out.println(aluno);

        //Poliformismo

        Pessoa pessoaAluno = aluno;

        Pessoa pessoaProfessor = professor;

        System.out.println(pessoaAluno);
        System.out.println(pessoaProfessor);

        Pessoa pessoaInteiro = new Pessoa(1);
        Pessoa pessoaString = new Pessoa("Nome");
        Pessoa pessoaStringInteiro = new Pessoa("Nome", 1);
        Pessoa pessoaInteiroString = new Pessoa(1, "Nome");

        System.out.println(pessoaInteiro);
        System.out.println(pessoaString);
        System.out.println(pessoaStringInteiro);
        System.out.println(pessoaInteiroString);

    }
}
