package br.com.fiap.gamesjpa.dao;

import br.com.fiap.gamesjpa.model.Category;
import jakarta.persistence.EntityManager;

public class CategoryDao {
    private EntityManager em;

    public CategoryDao(EntityManager em) {
        this.em = em;
    }

    public void save(Category category) {
        em.persist(category);
    }
}
