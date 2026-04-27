package br.com.fiap.gamesjpa;

import br.com.fiap.gamesjpa.dao.GameDao;
import br.com.fiap.gamesjpa.model.Game;
import br.com.fiap.gamesjpa.utils.Connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        EntityManager em = Connection.getEntityManager();

//        search(em);
        //insertGame(em);
        //listAllGames(em);
        updateGame(em);
    }

    public static void listAllGames(EntityManager em) {
        GameDao gameDao = new GameDao(em);
        List<Game> games = gameDao.listAllGames();

        for(Game game : games){
            System.out.println(game.getTitle());
        }
    }


    public static void search (EntityManager em) {
        GameDao dao = new GameDao(em);
        Game game1 = new Game();
        game1.setId(3L);

        Game foundedGame = dao.findGameById(game1);

        if (foundedGame != null) {
            System.out.println("Game found");
            System.out.println("ID: " + foundedGame);
        } else {
            System.out.println("Game not found");
        }
    }


    public static void insertGame(EntityManager em) {
        Game game1 = new Game();
        game1.setTitle("Resident Evil Requiem");
        game1.setReleaseDate(LocalDate.of(2026, 2, 12));
        game1.setPrice(399.9);
        game1.setDeveloper("Capcom");
        game1.setFinished(true);
        game1.setCategory("Horror");

        GameDao gameDao = new GameDao(em);
        em.getTransaction().begin();
        gameDao.save(game1);
        em.getTransaction().commit();
        em.close();
        System.out.println("Game created successfully");
    }


    public static void updateGame(EntityManager em) {
        Game game1 = new Game();
        game1.setId(41L);
        game1.setTitle("Resident Evil 9 :Requiem");
        game1.setReleaseDate(LocalDate.of(2026, 2, 12));
        game1.setPrice(399.9);
        game1.setDeveloper("Capcom");
        game1.setFinished(true);
        game1.setCategory("Horror");

        GameDao gameDao = new GameDao(em);
        em.getTransaction().begin();
        gameDao.update(game1);
        em.getTransaction().commit();
        em.close();
        System.out.println("Game updated successfully");
    }
}