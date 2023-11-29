package domain;

import java.util.List;

public class Turma {

    private Integer ano;

    private Integer semestre;

    private Integer diasDaSemana;

    private String horarios;

    private Disciplina disciplina;

    private Professor professor;

    private List<Avaliacao> avaliacoes;

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Turma(Integer ano, Integer semestre, Integer diasDaSemana, String horarios, Disciplina disciplina,
            Professor professor) {
        this.ano = ano;
        this.semestre = semestre;
        this.diasDaSemana = diasDaSemana;
        this.horarios = horarios;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(Integer diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma [ano=" + ano + ", semestre=" + semestre + ", diasDaSemana=" + diasDaSemana + ", horarios="
                + horarios + ", disciplina=" + disciplina + ", professor=" + professor + "]";
    }


}
