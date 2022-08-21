package org.example.DAO;

import javax.persistence.EntityManager;
import org.example.entity.Matricula_Curso_Aluno;

public class MatriculaDAO {

    private EntityManager em;

    public MatriculaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Matricula_Curso_Aluno matricula_curso_aluno) {
        this.em.persist(matricula_curso_aluno);
    }

    public void atualiza(Matricula_Curso_Aluno matricula_curso_aluno) {
        this.em.merge(matricula_curso_aluno);
    }

    public void remove(Matricula_Curso_Aluno matricula_curso_aluno) {
        atualiza(matricula_curso_aluno);
        this.em.remove(matricula_curso_aluno);
    }


}
