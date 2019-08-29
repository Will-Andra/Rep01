package A13Entregavel;

public abstract class Professor {
    private String nomeProfessor;
    private String sobreNomeProf;
    private Integer tempoCasa;
    private Integer codigoProf;
    private String tipoProf;
    private String alocadoProf;

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

    public String getTipoProf() {
        return tipoProf;
    }

    public String getAlocadoProf() {
        return alocadoProf;
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

    public void setTipoProf(String tipoProf){
        this.tipoProf = tipoProf;
    }

    public void setAlocadoProf(String alocadoProf) {
        this.alocadoProf = alocadoProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return nomeProfessor.equals(professor.nomeProfessor);
    }

    @Override
    public String toString() {
        return codigoProf + ". "+ nomeProfessor + " " + sobreNomeProf + " - Prof " +  tipoProf ;
    }
}
