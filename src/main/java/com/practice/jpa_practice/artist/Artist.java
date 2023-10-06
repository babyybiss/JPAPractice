package com.practice.jpa_practice.artist;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="TBL_ARTIST")
public class Artist {

    @Id
    @Column(name="ARTIST_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistNo;

    @Column(name="NAME", length=50)
    private String name;
    @Column(name="AGE", length=5)
    private int age;
    @Column(name="DEBUT_DATE")
    private LocalDate debutDate;
    @Column(name="GENRE")
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Column(name="TOTAL_ALBUMS")
    private int totalAlbums;
    @Embedded
    private NetWorth netWorth;

    public Artist() {
    }

    public Artist(String name, int age, LocalDate debutDate, Genre genre, int totalAlbums, NetWorth netWorth) {
        this.name = name;
        this.age = age;
        this.debutDate = debutDate;
        this.genre = genre;
        this.totalAlbums = totalAlbums;
        this.netWorth = netWorth;
    }

    public int getArtistNo() {
        return artistNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDebutDate() {
        return debutDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getTotalAlbums() {
        return totalAlbums;
    }

    public NetWorth getNetWorth() {
        return netWorth;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistNo=" + artistNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", debutDate=" + debutDate +
                ", genre=" + genre +
                ", totalAlbums=" + totalAlbums +
                ", netWorth=" + netWorth +
                '}';
    }
}
