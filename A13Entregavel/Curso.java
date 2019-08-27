package A13Entregavel;

import java.util.Objects;

public class Curso {

    private String nomeCurso;
    private Integer codigoCurso;
    private Integer qtdAluno;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;

    //Construtor
    public Curso(String nomeCurso,Integer codigoCurso, Integer qtdAluno){
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdAluno = qtdAluno;

    }



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

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
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

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return nomeCurso.equals(curso.nomeCurso) &&
                Objects.equals(codigoCurso, curso.codigoCurso) &&
                Objects.equals(qtdAluno, curso.qtdAluno) &&
                Objects.equals(professorTitular, curso.professorTitular) &&
                Objects.equals(professorAdjunto, curso.professorAdjunto);
    }


    @Override
    public String toString() {
        return  nomeCurso ;
          //      ", codigoCurso=" + codigoCurso +", qtdAluno=" + qtdAluno +
          //      ", professorTitular=" + professorTitular +
          //      ", professorAdjunto=" + professorAdjunto +
          //      '}';
    }
}
