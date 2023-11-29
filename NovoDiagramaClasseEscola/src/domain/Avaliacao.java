package domain;

public class Avaliacao {

    private Aluno aluno;

    private Turma turma;

    private Double nota1;

    private Double nota2;
    
    private Double notaFinal;

    private Double frquencia; // Em percentual

    public Avaliacao(Aluno aluno, Turma turma, Double nota1, Double nota2, Double notaFinal, Double frquencia) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaFinal = notaFinal;
        this.frquencia = frquencia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Double getFrquencia() {
        return frquencia;
    }

    public void setFrquencia(Double frquencia) {
        this.frquencia = frquencia;
    }

    @Override
    public String toString() {
        return "Avaliacao [aluno=" + aluno + ", turma=" + turma + ", nota1=" + nota1 + ", nota2=" + nota2
                + ", notaFinal=" + notaFinal + ", frquencia=" + frquencia + "]";
    }


}
