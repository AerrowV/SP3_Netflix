import java.io.File;
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

        loadMoviesFromList("Files/Movie.txt");
        loadSeriesFromList("Files/Series.txt");
        initializeGenreList();

    }

    public void initializeGenreList() {

        genreList.add("1: " + "History");
        genreList.add("2: " + "Comedy");
        genreList.add("3: " + "War");
        genreList.add("4: " + "Romance");
        genreList.add("5: " + "Sport");
        genreList.add("6: " + "Crime");
        genreList.add("7: " + "Mystery");
        genreList.add("8: " + "Fantasy");
        genreList.add("9: " + "Science Fiction");
        genreList.add("10: " + "Biography");
        genreList.add("11: " + "Drama");
        genreList.add("12: " + "Adventure");
        genreList.add("13: " + "Family");
        genreList.add("14: " + "Thriller");
        genreList.add("15: " + "Horror");
        genreList.add("16: " + "Film-Noir");
        genreList.add("17: " + "Musical");
        genreList.add("18: " + "Action");
        genreList.add("19: " + "Western");
        genreList.add("20: " + "Animation");
        genreList.add("21: " + "Talk Show");

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

    public void loadMoviesFromList(String path) {
        File movieFile = new File(path);
        try (Scanner scanner = new Scanner(movieFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length >= 4) {
                    String name = values[0].trim();
                    String releaseDate = (values[1].trim());
                    String genre = values[2].trim();
                    float rating = Float.parseFloat((values[3].trim()));
                    Movie movie = new Movie(name, releaseDate, genre, rating);
                    movieList.add(movie);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing value");
        }
    }

    public void loadSeriesFromList(String path) {
        File seriesFile = new File(path);
        try (Scanner scanner = new Scanner(seriesFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length >= 4) {
                    String name = values[0].trim();
                    String releaseDate = values[1].trim();
                    String genre = values[2].trim();
                    float rating = Float.parseFloat((values[3].trim()));
                    ArrayList<String> seasonEpisode = new ArrayList<>(List.of(values[4].trim().split(",")));
                    Series series = new Series(name, releaseDate, genre, rating, seasonEpisode);
                    seriesList.add(series);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing value");
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
}



