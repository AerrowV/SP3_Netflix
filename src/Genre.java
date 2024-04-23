import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Genre {
    private ArrayList<String> genre = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    NetflixMenu menu = new NetflixMenu();


    public ArrayList<String> getGenre() {
        return genre;
    }


    public String mediaWithThisGenre() {

        TextUI text = new TextUI();
        text.askForGenre();
        boolean whileKey = true;
        while (whileKey) {
            String input = scanner.nextLine();
            switch (input) {

                case "1":
                    System.out.println("Media with History genre");
                    whileKey = false;
                    return "History";
                case "2":
                    System.out.println("Media with Comedy genre");
                    whileKey = false;
                    return "Comedy";
                case "3":
                    System.out.println("Media with War genre");
                    whileKey = false;
                    return "War";
                case "4":
                    System.out.println("Media with Romance genre");
                    whileKey = false;
                    return "Romance";
                case "5":
                    System.out.println("Media with Sport genre");
                    whileKey = false;
                    return "Sport";
                case "6":
                    System.out.println("Media with Crime genre");
                    whileKey = false;
                    return "Crime";
                case "7":
                    System.out.println("Media with Mystery genre");
                    whileKey = false;
                    return "Mystery";
                case "8":
                    System.out.println("Media with Fantasy genre");
                    whileKey = false;
                    return "Fantasy";
                case "9":
                    System.out.println("Media with Science Fiction genre");
                    whileKey = false;
                    return "Science Fiction";
                case "10":
                    System.out.println("Media with Biography genre");
                    whileKey = false;
                    return "Biography";
                case "11":
                    System.out.println("Media with Drama genre");
                    whileKey = false;
                    return "Drama";
                case "12":
                    System.out.println("Media with Adventure genre");
                    whileKey = false;
                    return "Adventure";
                case "13":
                    System.out.println("Media with Family genre");
                    whileKey = false;
                    return "Family";
                case "14":
                    System.out.println("Media with Thriller genre");
                    whileKey = false;
                    return "Thriller";
                case "15":
                    System.out.println("Media with Horror genre");
                    whileKey = false;
                    return "Horror";
                case "16":
                    System.out.println("Media with Film-Noir genre");
                    whileKey = false;
                    return "Film-Noir";
                case "17":
                    System.out.println("Media with Musical genre");
                    whileKey = false;
                    return "Musical";
                case "18":
                    System.out.println("Media with Action genre");
                    whileKey = false;
                    return "Action";
                case "19":
                    System.out.println("Media with Western genre");
                    whileKey = false;
                    return "Western";
                case "20":
                    System.out.println("Media with Animation genre");
                    whileKey = false;
                    return "Animation";
                case "21":
                    System.out.println("Media with Talk show genre");
                    whileKey = false;
                    return "Talk show";
                default:
                    System.out.println("Invalid input, please try again");
                    break;
            }

        }

        return "";
    }

    public void searchGenre() {
        String chosenGenre = mediaWithThisGenre();
        TreeSet<MediaData> genreResults = new TreeSet<>();
        boolean genreFound = false;

        for (Movie movie : menu.getMovieList()) {
            String[] movieGenres = movie.getGenre().split(",");
            for (String genre : movieGenres) {
                if (genre.trim().equalsIgnoreCase(chosenGenre)) {
                    genreResults.add(movie);
                    genreFound = true;
                }
            }
        }

        for (Series series : menu.getSeriesList()) {
            String[] seriesGenres = series.getGenre().split(",");
            for (String genre : seriesGenres) {
                if (genre.trim().equalsIgnoreCase(chosenGenre)) {
                    genreResults.add(series);
                    genreFound = true;
                }
            }
        }

        if (genreFound) {
            menu.displaySearchMedia(genreResults);
        } else {
            System.out.println("There are no movies or series in this genre: " + chosenGenre);
        }
    }
}
