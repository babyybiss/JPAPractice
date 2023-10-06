package com.practice.jpa_practice.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArtistService {
    private ArtistRepository artistRepo;

    @Autowired
    public ArtistService(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

    @Transactional
    public void registArtist(ArtistDTO artistInfo) {
        Artist artist = new Artist(
                artistInfo.getName(),
                artistInfo.getAge(),
                artistInfo.getDebutDate(),
                artistInfo.getGenre(),
                artistInfo.getTotalAlbums(),
                new NetWorth(
                        artistInfo.getBeforeTaxNetWorth(),
                        artistInfo.getTax()
                )
        );

        artistRepo.save(artist);

    }
}
