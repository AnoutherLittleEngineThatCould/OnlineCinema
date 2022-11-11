import java.util.List;

public class Viewer {
    String name;
    int countFilms;
    List<Cinema> filmsView;
    int age = filmsView.size();

    public Viewer(String name, int countFilms, List<Cinema> filmsView) {
        this.name = name;
        this.countFilms = countFilms;
        this.filmsView = filmsView;

    }
}
