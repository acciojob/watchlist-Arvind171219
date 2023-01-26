package com.driver;

public class Director {
    private String name;
    private int numberofMovies;
    private double imbRating;

    public Director(String name, int numberofMovies, double imbRating) {
        this.name = name;
        this.numberofMovies = numberofMovies;
        this.imbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofMovies() {
        return numberofMovies;
    }

    public void setNumberofMovies(int numberofMovies) {
        this.numberofMovies = numberofMovies;
    }

    public double getImbRating() {
        return imbRating;
    }

    public void setImbRating(double imbRating) {
        this.imbRating = imbRating;
    }
}
