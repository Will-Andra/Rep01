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
    public void listaAlunos(){
        System.out.println(">> Alunos Cadastrados: ");
        for(int i = 0; i<Aluadd.size();i++){
            System.out.println("- " + Aluadd.get(i));
        }
        System.out.println("--------------------------------------");
    }

    //Lista de Professores
    public Professor profs = null;
    private List<Professor> profadd = new ArrayList<>();
    public void adicionaProf(Professor profs) {
        profadd.add(profs);
    }
    public void listaProf(){
        System.out.println(">> Professores Disponíveis: ");
        for(int i = 0; i<profadd.size();i++){
            System.out.println("- " + profadd.get(i));
        }
        System.out.println("--------------------------------------");
    }


    //Lista de Curso
    public Curso cursos;
    private List<Curso> cursoadd = new ArrayList<>();
    public void adicionaCurso(Curso cursos) {
        cursoadd.add(cursos);
    }
    public void listaCurso(){
        System.out.println(">> Cursos Disponíveis: ");
        for(int i = 0; i<cursoadd.size();i++){
            System.out.println("- " + cursoadd.get(i));
        }
        System.out.println("--------------------------------------");
    }



    //Lista de Matricula

    public Matricula matriculas = null;
    private List<Matricula> matriculaadd = new ArrayList<>();
    public void adicionaMatricula(Matricula matriculas) {
        matriculaadd.add(matriculas);
    }
    public void listaMatricula(){
        System.out.println(">> Matrículas Realizadas: ");
        for(int i = 0; i<matriculaadd.size();i++){
            System.out.println("- " + matriculaadd.get(i));
        }
        System.out.println("--------------------------------------");
    }

    //Alocação
    public Alocado alocados = null;
    private List<Alocado> alocadoadd = new ArrayList<>();
    public void adicionaAlocado(Alocado alocados) {
        alocadoadd.add(alocados);
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){

    }

    public void excluirCurso(Integer codigoCurso){
                //Se fosse para excluir o livro usar o codigo comentado abaixo
        cursoadd.remove((codigoCurso));

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

    }

    public void excluirProfessor(Integer codigoProfessor){

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }


 }

