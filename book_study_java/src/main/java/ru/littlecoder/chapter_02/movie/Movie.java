package ru.littlecoder.chapter_02.movie;

public class Movie {

    String title;

    String genre;

    int rating;

    void playIt() {
        System.out.println("проигрывание фильма");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
