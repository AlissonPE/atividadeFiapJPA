package org.example.DAO;

import javax.persistence.EntityManager;
import org.example.entity.Curso;

public class CursoDAO {

    private EntityManager em;

    public CursoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Curso curso) {
        this.em.persist(curso);
    }

    public void atualiza(Curso curso) {
        this.em.merge(curso);
    }

    public void remove(Curso curso) {
        atualiza(curso);
        this.em.remove(curso);
    }


}
