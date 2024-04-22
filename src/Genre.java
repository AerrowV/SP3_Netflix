import java.util.ArrayList;
import java.util.Scanner;

public class Genre {
    private NetflixMenu menu = new NetflixMenu();
    private FileIO file = new FileIO();
    private ArrayList<String> genre = new ArrayList<>();

    public ArrayList<String> getGenre() {
        return genre;
    }


    public String mediaWithThisGenre() {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    switch (input) {

        case "1":
            System.out.println("Media with History genre");
            return "History";
        case "2":
            System.out.println("Media with Comedy genre");
            return "Comedy";
        case "3":
            System.out.println("Media with War genre");
            return "War";
        case "4":
            System.out.println("Media with Romance genre");
            return "Romance";
        case "5":
            System.out.println("Media with Sport genre");
            return "Sport";
        case "6":
            System.out.println("Media with Crime genre");
            return "Crime";
        case "7":
            System.out.println("Media with Mystery genre");
            return "Mystery";
        case "8":
            System.out.println("Media with Fantasy genre");
            return "Fantasy";
        case "9":
            System.out.println("Media with Science Fiction genre");
            return "Science Fiction";
        case "10":
            System.out.println("Media with Biography genre");
            return "Biography";
        case "11":
            System.out.println("Media with Drama genre");
            return "Drama";
        case "12":
            System.out.println("Media with Adventure genre");
            return "Adventure";
        case "13":
            System.out.println("Media with Family genre");
            return "Family";
        case "14":
            System.out.println("Media with Thriller genre");
            return "Thriller";
        case "15":
            System.out.println("Media with Horror genre");
            return "Horror";
        case "16":
            System.out.println("Media with Film-Noir genre");
            return "Film-Noir";
        case "17":
            System.out.println("Media with Musical genre");
            return "Musical";
        case "18":
            System.out.println("Media with Action genre");
            return "Action";
        case "19":
            System.out.println("Media with Western genre");
            return "Western";
        case "20":
            System.out.println("Media with Animation genre");
            return "Animation";
        case "21":
            System.out.println("Media with Talk show genre");
            return "Talk show";
        default:
            System.out.println("Invalid input");
            break;


    }
return "";
}
}
