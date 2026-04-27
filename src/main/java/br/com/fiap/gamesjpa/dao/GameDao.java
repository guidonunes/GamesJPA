package br.com.fiap.gamesjpa.dao;

import br.com.fiap.gamesjpa.model.Game;
import jakarta.persistence.EntityManager;

public class GameDao {
    private EntityManager em;

    public GameDao(EntityManager em) {
        this.em = em;
    }

    public void save(Game game) {
        em.persist(game);
    }

    public void update(Game game) {
        em.merge(game);
    }

    public void delete(Game game) {
        Game gameToDelete = em.find(Game.class, game.getId());
        em.remove(gameToDelete);
    }
}
