package A13Entregavel;

import java.util.Objects;

public class Alocado {
    private Integer codprofADJ;
    private Integer codprofTIT;
    private Integer codcursoAlocado;
    private Integer Concat;
    private Curso curso;
    private Professor prof;

    //Construtor
    public Alocado(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        this.codcursoAlocado = codigoCurso;
        this.codprofADJ = codigoProfessorAdjunto;
        this.codprofTIT = codigoProfessorTitular;
        this.Concat = codigoCurso+codigoProfessorTitular+codigoProfessorAdjunto;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProf() {
        return prof;
    }

    public Integer getCodcursoAlocado() {
        return codcursoAlocado;
    }

    public Integer getCodprofADJ() {
        return codprofADJ;
    }

    public Integer getCodprofTIT() {
        return codprofTIT;
    }

    public Integer getConcat() {
        return Concat;
    }

    public void setCodcursoAlocado(Integer codcursoAlocado) {
        this.codcursoAlocado = codcursoAlocado;
    }

    public void setCodprofADJ(Integer codprofADJ) {
        this.codprofADJ = codprofADJ;
    }

    public void setCodprofTIT(Integer codprofTIT) {
        this.codprofTIT = codprofTIT;
    }

    public void setConcat(Integer concat) {
        Concat = concat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alocado alocado = (Alocado) o;
        return Concat.equals(alocado.Concat);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
