package A13Entregavel;

import javax.xml.crypto.Data;
import java.util.Date;


public class Matricula {

    public Curso curSo;
    public Integer codCur;
    public Integer codAlu;
    public Date dataDoDia;
    public String matricula;

      //construtor
    public Matricula(Integer cursos,Integer Alu){
        this.codAlu= Alu;
        this.codCur = cursos;
        this.dataDoDia = new Date();
        this.matricula =  "A-" + codAlu + codCur+ dataDoDia;
    }




    @Override
    public String toString() {
        return  matricula ;
    }
}
