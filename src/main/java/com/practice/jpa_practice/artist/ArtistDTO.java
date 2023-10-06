package com.practice.jpa_practice.artist;

import java.time.LocalDate;

public class ArtistDTO {

    private String name;
    private int age;
    private LocalDate debutDate;
    private Genre genre;
    private int totalAlbums;
    private int beforeTaxNetWorth;
    private double tax;

    public ArtistDTO() {
    }

    public ArtistDTO(String name, int age, LocalDate debutDate, Genre genre, int totalAlbums, int beforeTaxNetWorth, double tax) {
        this.name = name;
        this.age = age;
        this.debutDate = debutDate;
        this.genre = genre;
        this.totalAlbums = totalAlbums;
        this.beforeTaxNetWorth = beforeTaxNetWorth;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(LocalDate debutDate) {
        this.debutDate = debutDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getTotalAlbums() {
        return totalAlbums;
    }

    public void setTotalAlbums(int totalAlbums) {
        this.totalAlbums = totalAlbums;
    }

    public int getBeforeTaxNetWorth() {
        return beforeTaxNetWorth;
    }

    public void setBeforeTaxNetWorth(int beforeTaxNetWorth) {
        this.beforeTaxNetWorth = beforeTaxNetWorth;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "ArtistDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", debutDate=" + debutDate +
                ", genre=" + genre +
                ", totalAlbums=" + totalAlbums +
                ", beforeTaxNetWorth=" + beforeTaxNetWorth +
                ", tax=" + tax +
                '}';
    }
}
