package com.practice.jpa_practice.artist;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ArtistRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Artist artist) {
        manager.persist(artist);
    }
}
