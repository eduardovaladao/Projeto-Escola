package domain;

public class Aluno extends Pessoa{

    private String matricula;

    private String situacao;

    private Curso curso;

    public Aluno(String nome, String endereco, String telefone, String matricula, String situacao) {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.situacao = situacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno [matricula=" + matricula + ", situacao=" + situacao + "]";
    }
    
    

}
