package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FilmManagerTest {

    @Test
    public void shouldAddFilms() { //добавляет фильмы
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Джентльмены");

        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void showWhereLimitIsLessThanQuantity() { //выводит последние фильмы где лимит меньше количества фильмов
        FilmManager manager = new FilmManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли.Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showWhereLimitIsMoreThanQuantity() { //выводит последние фильмы, где лимит больше количества ильмов
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
