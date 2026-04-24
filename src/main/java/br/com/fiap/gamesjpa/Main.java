package br.com.fiap.gamesjpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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

        System.out.println("Connected successfully 🚀");

        emf.close();
    }
}