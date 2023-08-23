import domain.Aluno;
import domain.Curso;
import domain.Pessoa;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa p = new Pessoa("Eduardo Valadão",
                "R. Geraldino M. Rodrigues",
                "34998779645"
        );

        Aluno a = new Aluno(
                p.getNome(),
                p.getEndereco(),
                p.getTelefone(),
                "159.768.676-00",
                "Cursando"
        );

        Professor professor = new Professor(
                "Cricia",
                "Rua Teste",
                "34565657897",
                "Coordenadora"
        );

        Curso c = new Curso(
            1,
            "Desenvolvimento de Sistemas"
        );

        System.out.println(p);
        System.out.println(a);
        System.out.println(professor);
        System.out.println(c);
    }
}
