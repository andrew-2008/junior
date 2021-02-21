package ru.littlecoder.chapter_02.movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Байт клуб";
        three.genre = "Трагедия,но в целом весёлая";
        three.rating = 127;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

}
