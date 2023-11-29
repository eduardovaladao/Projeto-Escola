package domain;

import java.util.List;

public class Professor extends Pessoa {

    private Titulacao titulacaoMaxima;

    private Curso cursoCoordenado;

    private List<Curso> cursosAlocados;

    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Curso> getCursosAlocados() {
        return cursosAlocados;
    }

    public void setCursosAlocados(List<Curso> cursosAlocados) {
        this.cursosAlocados = cursosAlocados;
    }

    public Professor(String nome, String endereco, String telefone, Titulacao titulacaoMaxima) {
        super(nome, endereco, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public Titulacao getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(Titulacao titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public Curso getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setCursoCoordenado(Curso cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }

    @Override
    public String toString() {
        return super.toString() + "Professor [titulacaoMaxima=" + titulacaoMaxima + "]";
    }

}
