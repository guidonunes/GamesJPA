package br.com.fiap.gamesjpa.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class Connection {

    private static final Map<String, Object> props = new HashMap<>();

    static {
        props.put("javax.persistence.jdbc.url", System.getenv("DB_URL"));
        props.put("javax.persistence.jdbc.user", System.getenv("DB_USER"));
        props.put("javax.persistence.jdbc.password", System.getenv("DB_PASSWORD"));
    }

    public static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("GamesJPA", props);

    public static EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }
}