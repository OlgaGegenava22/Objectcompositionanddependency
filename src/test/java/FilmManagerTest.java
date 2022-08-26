import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerTest {

    @Test
    public void shouldAddSeveralFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilms("film1");

        String[] actual = manager.findAll();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoFilms() {
        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10Films() {
        FilmManager manager = new FilmManager();
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");
        manager.addFilms("film8");
        manager.addFilms("film9");
        manager.addFilms("film10");
        manager.addFilms("film11");
        manager.addFilms("film12");
        manager.addFilms("film13");
        manager.addFilms("film14");
        manager.addFilms("film15");
        manager.addFilms("film16");
        manager.addFilms("film17");
        manager.addFilms("film18");
        manager.addFilms("film19");
        manager.addFilms("film20");

        String[] actual = manager.findLast();
        String[] expected = {
                "film20",
                "film19",
                "film18",
                "film17",
                "film16",
                "film15",
                "film14",
                "film13",
                "film12",
                "film11"
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5Films() {
        FilmManager manager = new FilmManager(5);
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");
        manager.addFilms("film8");
        manager.addFilms("film9");
        manager.addFilms("film10");
        manager.addFilms("film11");
        manager.addFilms("film12");
        manager.addFilms("film13");
        manager.addFilms("film14");
        manager.addFilms("film15");
        manager.addFilms("film16");
        manager.addFilms("film17");
        manager.addFilms("film18");
        manager.addFilms("film19");
        manager.addFilms("film20");

        String[] actual = manager.findLast();
        String[] expected = {
                "film20",
                "film19",
                "film18",
                "film17",
                "film16",
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoLastFilms() {
        FilmManager manager = new FilmManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }
}

