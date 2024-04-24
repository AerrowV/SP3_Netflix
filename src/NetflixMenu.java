import javax.swing.*;
import java.util.*;

public class NetflixMenu {

    private int highNumber = 5;

    private int lowNumber;

    private ArrayList<String> genreList;

    private ArrayList<Movie> movieList;

    private ArrayList<Series> seriesList;

    Scanner scan = new Scanner(System.in);

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
        boolean key = false;
        StartMenu menu = new StartMenu();

        while (!key) {

            for (int i = 0; lowNumber < highNumber; lowNumber++) {
                System.out.println(movieList.get(lowNumber).toString());
            }

            System.out.println("\nType '1' for next page" + "\nType '2' for previous page" + "\nType '3' to return to first page" + "\nType '4' to return to menu");
            String userInput = scan.nextLine();
            switch (userInput) {

                case "1" -> this.highNumber += 5;
                case "2" -> {
                    if (this.lowNumber > 5) {
                        this.highNumber -= 5;
                        this.lowNumber -= 10;
                    } else {
                        System.out.println("You can't go any further back");
                    }
                }
                case "3" -> {
                    this.highNumber = 5;
                    this.lowNumber = 0;
                }
                case ("4") -> {
                    menu.userInterface();
                    key = true;
                }
                default -> System.out.println("Invalid input");

            }

        }

    }

    public void displaySeriesList() {
        boolean key = false;
        StartMenu menu = new StartMenu();

        while (!key) {

            for (int i = 0; lowNumber < highNumber; lowNumber++) {
                System.out.println(seriesList.get(lowNumber).toString());
            }

            System.out.println("\nType '1' for next page" + "\nType '2' for previous page" + "\nType '3' to return to first page" + "\nType '4' to return to menu");
            String userInput = scan.nextLine();
            switch (userInput) {

                case "1" -> this.highNumber += 5;
                case "2" -> {
                    if (this.lowNumber > 5) {
                        this.highNumber -= 5;
                        this.lowNumber -= 10;
                    } else {
                        System.out.println("You can't go any further back");
                    }
                }
                case "3" -> {
                    this.highNumber = 5;
                    this.lowNumber = 0;
                }
                case "4" -> {
                    menu.userInterface();
                    key = true;
                }

                default -> System.out.println("Invalid input");
            }
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
        NetflixMenu menu = new NetflixMenu();
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
        Movie movie = menu.selectMovie();
        movie.movieOptions();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }

    public Movie selectMovie(){
        TextUI ui = new TextUI();
        ui.displayMsg("Please select a movie number");
        String userChoice = ui.userInput();

        return movieList.get(Integer.parseInt(userChoice)-1);
    }

}



