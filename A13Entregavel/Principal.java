package A13Entregavel;

import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {


        //Cadastro de Alunos
        Aluno Alu1 = new Aluno("José", "Dos Santos", 1);
        Aluno Alu2 = new Aluno("Maria", "Da Silva", 2);
        Aluno Alu3 = new Aluno("João", "De Oliveira", 3);
        Aluno Alu4 = new Aluno("Paulo", "Vieira", 4);
        Aluno Alu5 = new Aluno("José", "Dos Santos", 1);
        Aluno Alu6 = new Aluno("André", "Perereira", 5);

        //Curso
        Curso cur1 = new Curso("Full Stack", 20001, 3);
        Curso cur2 = new Curso("Android", 20002, 3);


        //Professores - Titulares
        ProfessorTitular Proftit1 = new ProfessorTitular();
        Proftit1.setNomeProfessor("Mario");
        Proftit1.setSobreNomeProf("Sabido");
        Proftit1.setTempoCasa(10);
        Proftit1.setCodigoProf(1);
        Proftit1.setEspecialidadeProfTitu("Android");

        ProfessorTitular Proftit2 = new ProfessorTitular();
        Proftit2.setNomeProfessor("Carlos");
        Proftit2.setSobreNomeProf("Sabichão");
        Proftit2.setTempoCasa(8);
        Proftit2.setCodigoProf(2);
        Proftit2.setEspecialidadeProfTitu("IOS");


        //Professores - Adjuntos
        ProfessorAdjunto ProfAdj1 = new ProfessorAdjunto();
        ProfAdj1.setNomeProfessor("Maria");
        ProfAdj1.setSobreNomeProf("Sabe Mais");
        ProfAdj1.setTempoCasa(10);
        ProfAdj1.setCodigoProf(1);
        ProfAdj1.setQtshsProfAdj(40);

        ProfessorAdjunto ProfAdj2 = new ProfessorAdjunto();
        ProfAdj2.setNomeProfessor("Júlio");
        ProfAdj2.setSobreNomeProf("Sabe de Nada");
        ProfAdj2.setTempoCasa(8);
        ProfAdj2.setCodigoProf(2);
        ProfAdj1.setQtshsProfAdj(44);


        //Adiciona dados ao List de Alunos
        DigitalHouseManager  addTIPO = new DigitalHouseManager();
        addTIPO.adicionaAlu(Alu1);
        addTIPO.adicionaAlu(Alu2);
        addTIPO.adicionaAlu(Alu3);
        addTIPO.adicionaAlu(Alu4);
        addTIPO.adicionaAlu(Alu5);

        //Adiciona dados ao List de Professores
        addTIPO.adicionaProf(ProfAdj1);
        addTIPO.adicionaProf(ProfAdj2);
        addTIPO.adicionaProf(Proftit1);
        addTIPO.adicionaProf(Proftit2);

        //Adiciona dados ao List de Cursos
        addTIPO.adicionaCurso(cur1);
        addTIPO.adicionaCurso(cur2);


        //Adiciona dados ao List de Matrícula - matrícula só ocorre qdo for cadastrado
        //addMatricula.adicionaMatricula();
        //addMatricula.adicionaMatrícula(cur2);


        addTIPO.listaCurso();





    }}
