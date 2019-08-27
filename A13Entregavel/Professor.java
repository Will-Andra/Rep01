package A13Entregavel;

public abstract class Professor {
    private String nomeProfessor;
    private String sobreNomeProf;
    private Integer tempoCasa;
    private Integer codigoProf;


    //get
    public Integer getCodigoProf() {
        return codigoProf;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getSobreNomeProf() {
        return sobreNomeProf;
    }

    //set
    public void setCodigoProf(Integer codigoProf) {
        this.codigoProf = codigoProf;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setSobreNomeProf(String sobreNomeProf) {
        this.sobreNomeProf = sobreNomeProf;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return nomeProfessor.equals(professor.nomeProfessor);
    }


}
