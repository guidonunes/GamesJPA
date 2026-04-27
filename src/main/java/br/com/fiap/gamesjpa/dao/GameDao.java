package br.com.fiap.gamesjpa.dao;

import br.com.fiap.gamesjpa.model.Game;
import jakarta.persistence.EntityManager;

import java.util.List;

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

    public Game findGameById(Game game) {
        return em.find(Game.class, game.getId());
    }

    public List<Game> listAllGames() {
        String jpqlQuery = "SELECT g FROM Game g ORDER BY g.title ASC";
        return em.createQuery(jpqlQuery, Game.class).getResultList();
    }

}
