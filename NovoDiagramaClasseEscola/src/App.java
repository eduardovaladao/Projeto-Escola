import java.util.Arrays;

import domain.Aluno;
import domain.Avaliacao;
import domain.Curso;
import domain.Disciplina;
import domain.Pessoa;
import domain.Professor;
import domain.SituacaoAluno;
import domain.Titulacao;
import domain.Turma;

public class App {

    public static void lineJump() {
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa(
                "Eduardo Valadão",
                "Minha Rua",
                "12345678");

        Pessoa pessoa2 = new Pessoa(
                "Carlos Eduardo",
                "Rua teste",
                "99988878");

        Pessoa pessoa3 = new Pessoa(
                "Ricardo Boaventura",
                "Rua teste",
                "93453450");

        Pessoa pessoa4 = new Pessoa(
                "Bruno Queiroz",
                "Rua teste",
                "80808080");

        System.out.println(pessoa);
        lineJump();

        System.out.println(pessoa2);
        lineJump();

        System.out.println(pessoa3);
        lineJump();

        Professor professor = new Professor(
                pessoa2.getNome(),
                pessoa2.getEndereco(),
                pessoa2.getTelefone(),
                Titulacao.DOUTOR);

        Professor professor2 = new Professor(
                pessoa3.getNome(),
                pessoa3.getEndereco(),
                pessoa3.getTelefone(),
                Titulacao.MESTRE);

        Professor professor3 = new Professor(
                pessoa4.getNome(),
                pessoa4.getEndereco(),
                pessoa4.getTelefone(),
                Titulacao.ESPECIALISTA);

        System.out.println(professor);
        lineJump();

        System.out.println(professor2);
        lineJump();

        Curso curso = new Curso(
                1,
                "Análise e Desenvolvimento de Sistemas",
                professor);

        curso.setProfessoresAlocados(Arrays.asList(professor));

        System.out.println(curso);
        lineJump();

        Aluno aluno = new Aluno(
                "Serjin",
                "Sua rua",
                "222111333",
                "122211133",
                SituacaoAluno.MATRICULADO,
                curso);

        System.out.println(aluno);
        lineJump();

        Disciplina disciplina = new Disciplina(
                1,
                "Análise de Sistemas",
                66,
                "ementa",
                "Muitos livros aí",
                curso);

        Disciplina logica = new Disciplina(
                2,
                "Lógica de Programação",
                340,
                "ementa 2",
                "Mais livros aí",
                curso);

        Disciplina web = new Disciplina(
                3,
                "Web Design",
                30,
                "ementa 3",
                "TANTÃO DE LIVROS AÍ",
                curso);

        disciplina.setPreRequisitos(Arrays.asList(logica, web));

        System.out.println(logica);
        lineJump();

        System.out.println(web);
        lineJump();

        System.out.println(disciplina);
        lineJump();

        Turma turma = new Turma(
                2023,
                2,
                1,
                "7:30 até 9:10",
                disciplina,
                professor);

        Turma turma2 = new Turma(
                2023,
                2,
                1,
                "9:10 até 12:00",
                web,
                professor2);

        Turma turma3 = new Turma(
                2023,
                2,
                1,
                "9:10 até 12:00",
                logica,
                professor3);

        System.out.println(turma);
        lineJump();
        System.out.println(turma2);
        lineJump();
        System.out.println(turma3);
        lineJump();

        Avaliacao avaliacao = new Avaliacao(
                aluno,
                turma,
                9.75,
                8.25,
                8.30,
                0.6);

        Avaliacao avaliacao2 = new Avaliacao(
                aluno,
                turma2,
                7d, // "d" quer dizer Double
                8d, // 'Já evita de ficar colocando ".0" toda vez na frente'
                6d, // ' :) '
                0.3);

        Avaliacao avaliacao3 = new Avaliacao(
                aluno,
                turma3,
                5.25, // "d" quer dizer Double
                8.10, // 'Já evita de ficar colocando ".0" toda vez na frente'
                2.79, // ' :) '
                0.1);

        System.out.println(avaliacao);
        lineJump();

        System.out.println(avaliacao2);
        lineJump();

        System.out.println(avaliacao3);
        lineJump();

        System.out.println("FINISH PROGRAM! :)");
    }
}
