package br.com.fiap.gamesjpa;

import br.com.fiap.gamesjpa.dao.GameDao;
import br.com.fiap.gamesjpa.model.Game;
import br.com.fiap.gamesjpa.utils.Connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        EntityManager em = Connection.getEntityManager();
        GameDao gameDao = new GameDao(em);

        System.out.println("Connected successfully 🚀");

        Game game2 = new Game();
        game2.setTitle("Mafia");
        game2.setReleaseDate(LocalDate.of(2020, 2, 12));
        game2.setPrice(199.9);
        game2.setDeveloper("Eidos");
        game2.setFinished(true);
        game2.setCategory("Action");



        em.getTransaction().begin();
        gameDao.save(game2);
        em.getTransaction().commit();
        em.close();
        System.out.println("Game created successfully");

    }

}