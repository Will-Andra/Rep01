package A13Entregavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    public Aluno aluno;
    private String nomeCurso;
    private Integer codigoCurso;
    private Integer qtdAluno;


    //Construtor
    public Curso(String nomeCurso,Integer codigoCurso, Integer qtdAluno){
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdAluno = qtdAluno;

    }
public Curso(){}


    //get
    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Integer getQtdAluno() {
        return qtdAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }


    //set
    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setQtdAluno(Integer qtdAluno) {
        this.qtdAluno = qtdAluno;
    }


    public Boolean adicionarUmAluno(Aluno umAluno) {

        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return nomeCurso.equals(curso.nomeCurso) &&
                Objects.equals(codigoCurso, curso.codigoCurso) &&
                Objects.equals(qtdAluno, curso.qtdAluno);
    }


    @Override
    public String toString() {
        return  codigoCurso + " - " + nomeCurso ;
          //      ", codigoCurso=" + codigoCurso +", qtdAluno=" + qtdAluno +
          //      ", professorTitular=" + professorTitular +
          //      ", professorAdjunto=" + professorAdjunto +
          //      '}';
    }
}
