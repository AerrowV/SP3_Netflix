import javax.swing.plaf.FontUIResource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class NetflixMenu {


    private ArrayList<String> genreList;

    private ArrayList<Movie> movieList;

    private ArrayList<Series> seriesList;

    public NetflixMenu() {
        genreList = new ArrayList<>();
        movieList = new ArrayList<>();
        seriesList = new ArrayList<>();

        FileIO fileIO = new FileIO();
        fileIO.loadMoviesFromList("Files/Movie.txt", movieList);
        fileIO.loadSeriesFromList("Files/Series.txt", seriesList);
        initializeGenreList();

    }

    public void initializeGenreList() {

        genreList.add("1: History");
        genreList.add("2: Comedy");
        genreList.add("3: War");
        genreList.add("4: Romance");
        genreList.add("5: Sport");
        genreList.add("6: Crime");
        genreList.add("7: Mystery");
        genreList.add("8: Fantasy");
        genreList.add("9: Science Fiction");
        genreList.add("10: Biography");
        genreList.add("11: Drama");
        genreList.add("12: Adventure");
        genreList.add("13: Family");
        genreList.add("14: Thriller");
        genreList.add("15: Horror");
        genreList.add("16: Film-Noir");
        genreList.add("17: Musical");
        genreList.add("18: Action");
        genreList.add("19: Western");
        genreList.add("20: Animation");
        genreList.add("21: Talk Show");

    }

    public void displayMovieList() {
        for (Movie m : movieList) {
            System.out.println(m);
        }
    }


    public void displaySeriesList() {
        for (Series s : seriesList) {
            System.out.println(s);
        }
    }

    public void displayGenreList() {
        for (String g : genreList) {
            System.out.println(g);
        }
    }

    public void displaySearchMedia(TreeSet<MediaData> searchMedia) {
        for (MediaData md : searchMedia) {
            System.out.println(md);
        }
    }

    public void searchMedia(String keyword) {

        TreeSet<MediaData> set = new TreeSet<>();
        for (Movie movie : movieList) {
            if (movie.getName().toLowerCase().contains(keyword.toLowerCase())) {
                set.add(movie);
            }

        }
        for (Series series : seriesList) {
            if (series.getName().toLowerCase().contains(keyword.toLowerCase())) {
                set.add(series);
            }
        }

        displaySearchMedia(set);
    }
    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }
}



