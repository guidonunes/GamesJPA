package br.com.fiap.gamesjpa;

import br.com.fiap.gamesjpa.model.Game;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> props = new HashMap<>();

        props.put("javax.persistence.jdbc.url", System.getenv("DB_URL"));
        props.put("javax.persistence.jdbc.user", System.getenv("DB_USER"));
        props.put("javax.persistence.jdbc.password", System.getenv("DB_PASSWORD"));

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("GamesJPA", props);

        EntityManager em = emf.createEntityManager();

        System.out.println("Connected successfully 🚀");



        Game game1 = new Game();
        game1.setTitle("Spiderman");
        game1.setReleaseDate(LocalDate.of(2023, 8, 24));
        game1.setPrice(299.9);
        game1.setDeveloper("Insomniac");
        game1.setFinished(true);
        game1.setCategory("Action");

        em.getTransaction().begin();
        em.persist(game1);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Game created successfully");
        
    }
}