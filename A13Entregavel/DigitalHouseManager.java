package A13Entregavel;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DigitalHouseManager {
    //Lista de eAlunos
    public Aluno alunos = null;

    private List<Aluno> Aluadd = new ArrayList<>();

    public void adicionaAlu(Aluno alunos) {
        Aluadd.add(alunos);
    }

    //Lista de Professores
    public Professor profs = null;

    private List<Professor> profadd = new ArrayList<>();

    public void adicionaProf(Professor profs) {
        profadd.add(profs);
    }


    //Lista de Curso
    public Curso cursos;

    private List<Curso> cursoadd = new ArrayList<>();

    public void adicionaCurso(Curso cursos) {
        cursoadd.add(cursos);
    }

    public void listaCurso(){
        System.out.println("Cursos Cadastrados: ");
        for(int i = 0; i<cursoadd.size();i++){
            System.out.println(cursoadd.get(i));
        }
    }



    //Lista de Matricula
    public Matricula matriculas = null;

    private List<Matricula> matriculaadd = new ArrayList<>();

    public void adicionaMatricula(Matricula matriculas) {
        matriculaadd.add(matriculas);
    }






}

