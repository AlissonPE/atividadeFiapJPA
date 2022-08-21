package org.example.DAO;

import javax.persistence.EntityManager;
import org.example.entity.Professor;

public class ProfessorDAO {

    private EntityManager em;

    public ProfessorDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Professor professor) {
        this.em.persist(professor);
    }

    public void atualiza(Professor professor) {
        this.em.merge(professor);
    }

    public void remove(Professor professor) {
        atualiza(professor);
        this.em.remove(professor);
    }


}
