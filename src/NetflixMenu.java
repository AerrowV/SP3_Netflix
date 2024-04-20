import java.util.ArrayList;
import java.util.TreeSet;

public class NetflixMenu {

    public TreeSet<MediaData> getSearchMedia() {
        return searchMedia;
    }

    private TreeSet<MediaData> searchMedia= new TreeSet<>();

    private ArrayList<Genre> genreList;

    private ArrayList<Movie> movieList;

    private ArrayList<Series> seriesList;


}
