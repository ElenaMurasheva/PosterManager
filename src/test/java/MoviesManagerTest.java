import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void addFourMovies() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");

        String[] expected = {"Film1", "Film2", "Film3", "Film4"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addOneMovie() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addZeroMovie() {
        MoviesManager manager = new MoviesManager();
        manager.add(null);

        String[] expected = {null};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastFourMovies() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");

        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastTwelveMovies() {
        MoviesManager manager = new MoviesManager(12);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
        manager.add("Film13");
        manager.add("Film14");

        String[] expected = {"Film14", "Film13", "Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastFiveMovies() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
        manager.add("Film13");
        manager.add("Film14");

        String[] expected = {"Film14", "Film13", "Film12", "Film11", "Film10"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastMovies() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
        manager.add("Film13");
        manager.add("Film14");

        String[] expected = {"Film14", "Film13", "Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
}
