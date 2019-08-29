package A13Entregavel;

import java.util.HashMap;

public class Principal {


    public static void main(String[] args) {


        //Cadastro de Alunos
        Aluno Alu1 = new Aluno("José", "Dos Santos", 1);
        Aluno Alu2 = new Aluno("Maria", "Da Silva", 2);
        Aluno Alu3 = new Aluno("João", "De Oliveira", 3);
        Aluno Alu4 = new Aluno("Paulo", "Vieira", 4);



        //Curso
        Curso cur1 = new Curso("Full Stack", 20001, 3);
        Curso cur2 = new Curso("Android", 20002, 3);
        Curso cur3 = new Curso("OIS", 20003, 3);


        //Professores - Titulares
        ProfessorTitular Proftit1 = new ProfessorTitular();
        Proftit1.setNomeProfessor("Mario");
        Proftit1.setSobreNomeProf("Sabido");
        Proftit1.setTempoCasa(10);
        Proftit1.setCodigoProf(1);
        Proftit1.setEspecialidadeProfTitu("Android");
        Proftit1.setTipoProf("Titular");
        Proftit1.setAlocadoProf("N");

        ProfessorTitular Proftit2 = new ProfessorTitular();
        Proftit2.setNomeProfessor("Carlos");
        Proftit2.setSobreNomeProf("Sabichão");
        Proftit2.setTempoCasa(8);
        Proftit2.setCodigoProf(2);
        Proftit2.setEspecialidadeProfTitu("IOS");
        Proftit2.setTipoProf("Titular");
        Proftit2.setAlocadoProf("N");


        //Professores - Adjuntos
        ProfessorAdjunto ProfAdj1 = new ProfessorAdjunto();
        ProfAdj1.setNomeProfessor("Maria");
        ProfAdj1.setSobreNomeProf("Sabe Mais");
        ProfAdj1.setTempoCasa(10);
        ProfAdj1.setCodigoProf(3);
        ProfAdj1.setQtshsProfAdj(40);
        ProfAdj1.setTipoProf("Adjunto");
        ProfAdj1.setAlocadoProf("N");

        ProfessorAdjunto ProfAdj2 = new ProfessorAdjunto();
        ProfAdj2.setNomeProfessor("Júlio");
        ProfAdj2.setSobreNomeProf("Sabe de Nada");
        ProfAdj2.setTempoCasa(8);
        ProfAdj2.setCodigoProf(4);
        ProfAdj2.setQtshsProfAdj(44);
        ProfAdj2.setTipoProf("Adjunto");
        ProfAdj2.setAlocadoProf("N");

        //Adiciona Matrícula
        Matricula addMatricula1 = new Matricula(cur1.getCodigoCurso(),Alu1.getCodigoAluno());
        Matricula addMatricula2 = new Matricula(cur1.getCodigoCurso(),Alu2.getCodigoAluno());
        Matricula addMatricula3 = new Matricula(cur2.getCodigoCurso(),Alu3.getCodigoAluno());
        Matricula addMatricula4 = new Matricula(cur2.getCodigoCurso(),Alu4.getCodigoAluno());

        //Adiciona dados ao List de Alunos
        DigitalHouseManager  DHmanager = new DigitalHouseManager();
        DHmanager.adicionaAlu(Alu1);
        DHmanager.adicionaAlu(Alu2);
        DHmanager.adicionaAlu(Alu3);
        DHmanager.adicionaAlu(Alu4);


        //Adiciona dados ao List de Professores
        DHmanager.adicionaProf(ProfAdj1);
        DHmanager.adicionaProf(ProfAdj2);
        DHmanager.adicionaProf(Proftit1);
        DHmanager.adicionaProf(Proftit2);

        //Adiciona dados ao List de Cursos
        DHmanager.adicionaCurso(cur1);
        DHmanager.adicionaCurso(cur2);
        DHmanager.adicionaCurso(cur3);

        //Adiciona ao List de Matrícula
        DHmanager.adicionaMatricula(addMatricula1);
        DHmanager.adicionaMatricula(addMatricula2);
        DHmanager.adicionaMatricula(addMatricula3);
        DHmanager.adicionaMatricula(addMatricula4);


        System.out.println("\n* Digital House Manager **************\n");
        DHmanager.listaCurso();
        DHmanager.listaProf();
        DHmanager.listaAlunos();
        DHmanager.listaMatricula();

        //Acrescentando a alocação de prof
        Alocado aloc1 = new Alocado(20001,1,3);
        Alocado aloc2 = new Alocado(20002,2,4);

        //Curso cur2 = new Curso("Android", 20002, 3);
        DHmanager.registrarCurso("IOS",20003,4);






    }}
