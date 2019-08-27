package A13Entregavel;

import java.util.Objects;

public class Aluno {
    private String nomeAluno;
    private String sobreNomeAlu;
    private Integer codigoAluno;
    public DigitalHouseManager Adds;


    //Construtor
    public Aluno(String nomeAluno, String sobreNomeAlu,Integer codigoAluno){
        this.nomeAluno = nomeAluno;
        this.sobreNomeAlu = sobreNomeAlu;
        this.codigoAluno = codigoAluno;
    }


    //get
    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getSobreNomeAlu() {
        return sobreNomeAlu;
    }

    //Set
    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setSobreNomeAlu(String sobreNomeAlu) {
        this.sobreNomeAlu = sobreNomeAlu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nomeAluno.equals(aluno.nomeAluno) &&
                sobreNomeAlu.equals(aluno.sobreNomeAlu) &&
                codigoAluno.equals(aluno.codigoAluno) &&
                Adds.equals(aluno.Adds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAluno);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", sobreNomeAlu='" + sobreNomeAlu + '\'' +
                ", codigoAluno=" + codigoAluno +
                ", Adds=" + Adds +
                '}';
    }
}
