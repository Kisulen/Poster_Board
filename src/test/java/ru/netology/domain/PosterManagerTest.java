package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

public class PosterManagerTest {

    @Test
    public void addFindAll() {
        String movie1 = "Movie I";
        String movie2 = "Movie II";
        String movie3 = "Movie III";
        String movie4 = "Movie IV";
        String movie5 = "Movie V";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllNoMovies() {
        String[] movies = new String[0];

        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFindOneMovie() {
        String movie1 = "Movie I";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);

        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        String movie1 = "Movie I";
        String movie2 = "Movie II";
        String movie3 = "Movie III";
        String movie4 = "Movie IV";
        String movie5 = "Movie V";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNoMovies() {
        String[] movies = new String[0];

        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastOneMovie() {
        String movie1 = "Movie I";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);

        String[] expected = {"Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenMovies() {
        String movie1 = "Movie I";
        String movie2 = "Movie II";
        String movie3 = "Movie III";
        String movie4 = "Movie IV";
        String movie5 = "Movie V";
        String movie6 = "Movie VI";
        String movie7 = "Movie VII";
        String movie8 = "Movie VIII";
        String movie9 = "Movie IX";
        String movie10 = "Movie X";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {"Movie X", "Movie IX", "Movie VIII", "Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOverLimit() {
        String movie1 = "Movie I";
        String movie2 = "Movie II";
        String movie3 = "Movie III";
        String movie4 = "Movie IV";
        String movie5 = "Movie V";
        String movie6 = "Movie VI";

        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);

        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastBuilder() {
        String movie1 = "Movie I";
        String movie2 = "Movie II";
        String movie3 = "Movie III";

        PosterManager manager = new PosterManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] expected = {"Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
