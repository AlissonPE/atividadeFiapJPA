package org.example;


import java.time.LocalDate;
import javax.persistence.Persistence;
import org.example.DAO.AlunoDAO;
import org.example.DAO.CursoDAO;
import org.example.DAO.MatriculaDAO;
import org.example.DAO.ProfessorDAO;
import org.example.entity.Aluno;
import org.example.entity.Curso;
import org.example.entity.Matricula_Curso_Aluno;
import org.example.entity.Professor;

public class BancoTeste {

    public static void main(String[] args) {
        var em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
        AlunoDAO alunoDAO = new AlunoDAO(em);
        CursoDAO cursoDAO = new CursoDAO(em);
        MatriculaDAO matriculaDAO = new MatriculaDAO(em);
        ProfessorDAO professorDAO = new ProfessorDAO(em);

        Professor professor = new Professor("Alisson", "PHD em tecnologias da informação", LocalDate.of(2003,6,12));
        Curso curso = new Curso(professor, "Java", 80, LocalDate.now());
        Aluno aluno = new Aluno("Gabriel Malaquias", "3763", LocalDate.of(2003,8, 11), "1199", "biel@gmail");
        Matricula_Curso_Aluno matricula = new Matricula_Curso_Aluno(curso,aluno,LocalDate.now(), LocalDate.of(2022,12,01));


        em.getTransaction().begin();

        alunoDAO.cadastrar(aluno);
        professorDAO.cadastrar(professor);
        cursoDAO.cadastrar(curso);
        matriculaDAO.cadastrar(matricula);

        em.getTransaction().commit();
        em.close();


    }


}
