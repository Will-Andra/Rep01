package A13Entregavel;

import javax.xml.crypto.Data;
import java.util.Date;

public class Matricula {
    public Aluno aluno;
    public Curso curso;
    public Date dataDoDia;
    public String matricula;

      //construtor
    public Matricula(Aluno aluno,Curso curso){
        this.aluno= aluno;
        this.curso = curso;
        this.dataDoDia = new Date();
        this.matricula = "A" + aluno.getCodigoAluno()+dataDoDia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }


}
